/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

import java.util.ArrayList;
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
public class VehicleDTOTest {
    
    public VehicleDTOTest() {
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
     * Test of getListSize method, of class VehicleDTO, where parameter is an empty string.
     */
    @Test
    public void testGetListSize() {
        VehicleDTO instance = new VehicleDTO("");
        int expResult = 4;
        int result = instance.getListSize();
        assertEquals(result,expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getRegNumber method, of class VehicleDTO, where parameter is an empty string
     */
    @Test
    public void testGetRegNumberEmptyString() {
        VehicleDTO instance = new VehicleDTO("");
        String expResult = "";
        String result = instance.getRegNumber();
        assertEquals("Wrong string is returned", expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of getRegNumber method, of class VehicleDTO.
     */
    @Test
    public void testGetRegNumber() {
        VehicleDTO instance = new VehicleDTO("LUL321");
        String expResult = "LUL321";
        String result = instance.getRegNumber();
        assertEquals("Wrong string is returned", expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

 
    /**
     * Test if FindPart method, of class VehicleDTO where parameters are empty strings
     */
    @Test
    public void testFindPart() {
        VehicleDTO vehicle = new VehicleDTO("");
        VehiclePart expResult = vehicle.getListOfParts().get(0);
        VehiclePart result = vehicle.findPart();
        assertEquals("Returned VehiclePart should be the first VehiclePart in the ArrayList, 'Brake'",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getListOfParts method, of class VehicleDTO.
     */
    @Test
    public void testGetListOfParts() {
        VehicleDTO instance = new VehicleDTO("");
        ArrayList<VehiclePart> expResult = null;
        ArrayList<VehiclePart> result = instance.getListOfParts();
        assertNotEquals("ArrayList should not be null", expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
