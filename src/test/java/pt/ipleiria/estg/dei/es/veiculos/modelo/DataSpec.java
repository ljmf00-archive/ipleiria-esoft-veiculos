/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.estg.dei.es.veiculos.modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luis
 */
public class DataSpec {

    public DataSpec() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testarCriarDatasValidas() {
        assertEquals("1/2/2020", new Data(1,2,2020).toString());
        assertEquals("1/2/2020", new Data(32,1,2020).toString());
        assertEquals("1/1/2021", new Data(1,13,2020).toString());
        assertEquals("31/12/2020", new Data(31,12,2020).toString());
        assertEquals("29/2/2020", new Data(29,2,2020).toString());
        assertEquals("1/3/2019", new Data(29,2,2019).toString());
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
