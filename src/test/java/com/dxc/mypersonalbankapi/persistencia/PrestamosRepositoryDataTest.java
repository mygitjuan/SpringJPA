package com.dxc.mypersonalbankapi.persistencia;

import com.dxc.mypersonalbankapi.config.SpringConfig;
import com.dxc.mypersonalbankapi.modelos.prestamos.Prestamo;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringConfig.class})
@TestMethodOrder( MethodOrderer.OrderAnnotation.class)
@EnableAutoConfiguration
class PrestamosRepositoryDataTest {
    @Autowired
    private PrestamosRepositoryData prestamosRepo;

    @Test
    @Transactional
    void getAll() {
        List<Prestamo> prestamos = prestamosRepo.findAll();
        System.out.println(prestamos);

        assertNotNull(prestamos);
        assertTrue(prestamos.size() > 0);
    }
/*
    @Test
    void getLoanById() {
    }

    @Test
    void addLoan() {
    }

    @Test
    void deleteLoan() {
    }

    @Test
    void updateLoan() {
    }

    @Test
    void getLoansByClient() {
    }

    @Test
    void getLoansByClientAndId() {
    }

    @Test
    void getdb_url() {
    }*/
}