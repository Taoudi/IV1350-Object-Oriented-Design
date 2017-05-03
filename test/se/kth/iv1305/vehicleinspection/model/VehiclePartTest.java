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
public class VehiclePartTest {
    
    public VehiclePartTest() {
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
     * Test of toString method, of class VehiclePart with empty string as parameter.
     */
    @Test
    public void testToStringEmptyString() {
        VehiclePart instance = new VehiclePart("");
        String expResult = "";
        String result = instance.toString();
        assertEquals("Wrong string returned", expResult, result);
    }
    
    /**
     * Test of toString method, of class VehiclePart.
     */
    @Test
    public void testToString() {
        VehiclePart instance = new VehiclePart("ABC123");
        String expResult = "ABC123";
        String result = instance.toString();
        assertEquals("Wrong string returned",expResult, result);
    }
}
