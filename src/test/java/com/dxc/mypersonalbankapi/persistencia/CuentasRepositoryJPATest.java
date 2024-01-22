package com.dxc.mypersonalbankapi.persistencia;

import com.dxc.mypersonalbankapi.modelos.cuentas.Cuenta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;


import com.dxc.mypersonalbankapi.modelos.prestamos.Prestamo;
import com.dxc.mypersonalbankapi.modelos.clientes.Cliente;
import com.dxc.mypersonalbankapi.modelos.clientes.Empresa;
import com.dxc.mypersonalbankapi.modelos.clientes.Personal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import com.dxc.mypersonalbankapi.config.SpringConfig;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringConfig.class})
@TestMethodOrder( MethodOrderer.OrderAnnotation.class)
@EnableAutoConfiguration
class CuentasRepositoryJPATest {

    @Autowired
    private ICuentasRepo cuentasRepo;

    @Test
    void getAll() {
        List<Cuenta> cuentas = cuentasRepo.getAll();
        System.out.println(cuentas);

        assertNotNull(cuentas);
        assertTrue(cuentas.size() > 0);

    }

    @Test
    void getAccountById() {
    }

    @Test
    void addAccount() {
    }

    @Test
    void deleteAccount() {
    }

    @Test
    void updateAccount() {
    }

    @Test
    void getAccountsByClient() {
    }

    @Test
    void getAccountsByClientAndId() {
    }
}