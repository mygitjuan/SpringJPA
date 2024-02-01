package com.dxc.mypersonalbankapi.controladores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.dxc.mypersonalbankapi.config.SpringConfig;
import com.dxc.mypersonalbankapi.modelos.clientes.Cliente;
import com.dxc.mypersonalbankapi.modelos.clientes.Empresa;
import com.dxc.mypersonalbankapi.modelos.clientes.Personal;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringConfig.class})
@TestMethodOrder( MethodOrderer.OrderAnnotation.class)
@EnableAutoConfiguration
class ClientesControllerTest {


    private ClientesController clientesController;
    @Test
    void mostrarLista() {
    }

    @Test
    void mostrarDetalle() {
    }

    @Test
    void add() throws Exception {
        Cliente newCliente = new Personal(null,"Mario Bros","mariobData@m.com","Calle Nintendo", LocalDate.now(),true,false, "96845713G" );

        String[] cadena = new String[]{"1" + "Mario Bros" + "mariobDataControl@m.com" + "Calle Nintendo" + "LocalDate.now()" + "true" + "false" + "96845713G"};

        clientesController.add(cadena);



        assertThat(newCliente, notNullValue());
        assertThat(newCliente.getId(), greaterThan(0));
    }

    @Test
    void eliminar() {
    }

    @Test
    void actualizar() {
    }

    @Test
    void evaluarPrestamo() {
    }
}