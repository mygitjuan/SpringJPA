package com.dxc.mypersonalbankapi.controladores;

import com.dxc.mypersonalbankapi.modelos.clientes.Cliente;
import com.dxc.mypersonalbankapi.modelos.prestamos.Prestamo;
import com.dxc.mypersonalbankapi.exceptions.PrestamoException;
import com.dxc.mypersonalbankapi.persistencia.ClientesInMemoryRepo;
import com.dxc.mypersonalbankapi.persistencia.IClientesRepo;
import com.dxc.mypersonalbankapi.persistencia.IPrestamosRepo;
import com.dxc.mypersonalbankapi.persistencia.PrestamosInMemoryRepo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class PrestamosController {
    //private static IPrestamosRepo prestamosRepo = PrestamosInMemoryRepo.getInstance();
    //private static IClientesRepo clientesRepo = ClientesInMemoryRepo.getInstance();
    @Setter @Getter
    private static IClientesRepo clientesRepo;
    @Setter @Getter
    private static IPrestamosRepo prestamosRepo;

    public static void mostrarLista(Integer uid) {
        System.out.println("\nLista de prestamos del cliente: " + uid);
        System.out.println("───────────────────────────────────");

        try {
            List<Prestamo> prestamos = prestamosRepo.getLoansByClient(uid);
            if (prestamos != null && prestamos.size() > 0) System.out.println(prestamos);
            else System.out.println("El cliente no tiene prestamos!");
        } catch (PrestamoException e) {
            System.out.println("Cliente NO encontrado 😞! \nCode: " + e.getCode());
        } catch (Exception e) {
            System.out.println("Oops ha habido un problema, inténtelo más tarde 😞!");
        }
    }

    public static void mostrarDetalle(Integer uid, Integer lid) {
        System.out.println("\nDetalle de prestamo: " + lid + ", del cliente: " + uid);
        System.out.println("───────────────────────────────────");

        try {
            Prestamo prestamo = prestamosRepo.getLoansByClientAndId(uid, lid);
            System.out.println(prestamo);
        } catch (PrestamoException e) {
            System.out.println("Prestamo NO encontrado para el cliente 😞! \nCode: " + e.getCode());
        } catch (Exception e) {
            System.out.println("Oops ha habido un problema, inténtelo más tarde 😞!");
        }
    }

    public static void eliminar(Integer uid, Integer lid) {
        System.out.println("\nBorrando prestamo: " + lid + ", para cliente: " + uid);
        System.out.println("───────────────────────────────────");

        try {
            Prestamo pr = prestamosRepo.getLoansByClientAndId(uid, lid);
            boolean borrado = prestamosRepo.deleteLoan(pr);
            if (borrado) {
                Cliente cl = clientesRepo.getClientById(uid);
                cl.delisgarPrestamo(pr);
                System.out.println("Préstamo borrada 🙂!!");
                mostrarLista(uid);
            } else System.out.println("Préstamo NO borrado 😞!! Consulte con su oficina.");
        } catch (PrestamoException e) {
            System.out.println("Préstamo NO encontrado 😞! \nCode: " + e.getCode());
        } catch (Exception e) {
            System.out.println("Oops ha habido un problema, inténtelo más tarde 😞!");
        }

    }

    public static void add(Integer uid, String[] args) {
        System.out.println("uid: " + uid);
        for (String arg : args) {
            System.out.println(arg);
        }
        // TODO
    }

    public static void actualizar(Integer uid, Integer lid, String[] args) {
        System.out.println("uid: " + uid);
        System.out.println("lid: " + lid);
        for (String arg : args) {
            System.out.println(arg);
        }
        // TODO
    }
}
