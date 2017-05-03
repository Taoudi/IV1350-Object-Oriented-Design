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
import se.kth.iv1305.vehicleinspection.model.VehicleDTO;

/**
 *
 * @author taoudi
 */
public class RegNumberRegistryTest {

    public RegNumberRegistryTest() {
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
     * Test of checkIfValid method, of class RegNumberRegistry.
     */
    @Test
    public void testCheckIfValidEmptyString() {
        VehicleDTO vehicle = new VehicleDTO("");
        boolean expResult = false;
        boolean result = RegNumberRegistry.checkIfValid(vehicle);
        assertEquals("There should not be an empty string in registry", expResult, result);
    }

    /**
     * Test of checkIfValid method, of class RegNumberRegistry.
     */
    @Test
    public void testCheckIfValid() {
        VehicleDTO vehicle = new VehicleDTO("LUL123"); //The string must be an element of the array in RegNumberRegistry
        boolean expResult = true;
        boolean result = RegNumberRegistry.checkIfValid(vehicle);
        assertEquals("There should not be an empty string in registry", expResult, result);
    }

}
