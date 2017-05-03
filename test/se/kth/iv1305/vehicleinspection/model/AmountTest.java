/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

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
public class AmountTest {
    
    public AmountTest() {
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
     * Test of getAmountAsDouble method with a negative double, of class Amount.
     */
    @Test
    public void testGetAmountAsDoubleNeg() {
        Amount instance = new Amount(-30);
        double expResult = -30;
        double result = instance.getAmountAsDouble();
        assertEquals("Negative numbers are not returned correctly",expResult, result,-30);
    }
    /**
     * Test of getAmountAsDouble method with zero, of class Amount.
     */
    @Test
    public void testGetAmountAsDoubleZero() {
        Amount instance = new Amount(0);
        double expResult = 0;
        double result = instance.getAmountAsDouble();
        assertEquals("Zero are is returned correctly",expResult, result,0);
    }
    
     /**
     * Test of getAmountAsDouble method with a positive double, of class Amount.
     */
    @Test
    public void testGetAmountAsDoublePos() {
        Amount instance = new Amount(20);
        double expResult = 20;
        double result = instance.getAmountAsDouble();
        assertEquals("Zero are is returned correctly",expResult, result,20);
    }
    
}
