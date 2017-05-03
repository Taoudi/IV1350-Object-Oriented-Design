/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.integration;

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
public class InspectionCatalogTest {
    
    public InspectionCatalogTest() {
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
     * Test of storeResult method, of class InspectionCatalog. Checks if the stored result is false
     */
    @Test
    public void testStoreResultFalse() {  
        boolean inspectionPassed = false;
        InspectionCatalog instance = new InspectionCatalog();
        instance.storeResult(inspectionPassed);
        assertFalse(instance.getResultList().get(0).getBoolean());
    }
    /**
     * Test of storeResult method, of class InspectionCatalog. Checks if the stores result is true
     */
    @Test
    public void testStoreResultTrue() {  
        boolean inspectionPassed = true;
        InspectionCatalog instance = new InspectionCatalog();
        instance.storeResult(inspectionPassed);
        assertTrue(instance.getResultList().get(0).getBoolean());
    }
    /**
     * Test of getResultList method, of class InspectionCatalog.
     */
    @Test
    public void testGetResultList() {
        InspectionCatalog instance = new InspectionCatalog();
        ArrayList<Result> expResult = null;
        ArrayList<Result> result = instance.getResultList();
        assertNotEquals("List should not be null", expResult, result);
      
    }
    
}
