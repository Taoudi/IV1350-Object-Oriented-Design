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
public class RegistryCreatorTest {
    
    public RegistryCreatorTest() {
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
     * Test of getNumberRegistry method, of class RegistryCreator.
     * Checks if the methods returns an instance of RegNumberRegistry
     */
    @Test
    public void testGetNumberRegistry() {
       RegistryCreator instance = new RegistryCreator();
       if(!(instance.getNumberRegistry() instanceof RegNumberRegistry))
           fail("The method should return an instance of RegNumberRegistry");
    }

    /**
     * Test of getInspectionCatalog method, of class RegistryCreator.
     * Checks if the methods returns an instance of InspectionCatalog
     */
    @Test
    public void testGetInspectionCatalog() {
        RegistryCreator instance = new RegistryCreator();
        if(!(instance.getInspectionCatalog() instanceof InspectionCatalog))
            fail("The method should return an instance of InspectionCatalog");
    }
    
}
