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
public class ReceiptTest {
    
    public ReceiptTest() {
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
     * Test of toString method, of class Receipt.
     */
    @Test
    public void testToStringEmptyString() {
        Receipt instance = new Receipt("");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of toString method, of class Receipt.
     */
    @Test
    public void testToString() {
        Receipt instance = new Receipt("hejsan");
        String expResult = "hejsan";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
