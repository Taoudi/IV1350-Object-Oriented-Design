/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.integration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author taoudi
 */
public class ResultTest {
    
    public ResultTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBoolean method, of class Result if parameter is false.
     */
    @Test
    public void testGetBooleanFalse() {
        Result instance = new Result(false);
        boolean expResult = false;
        boolean result = instance.getBoolean();
        assertEquals(expResult, result);   
    }
    
    /**
     * Test of getBoolean method, of class Result if parameter is true.
     */
    @Test
    public void testGetBooleanTrue() {
        Result instance = new Result(true);
        boolean expResult = true;
        boolean result = instance.getBoolean();
        assertEquals(expResult, result);   
    }

 
}
