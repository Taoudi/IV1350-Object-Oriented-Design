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
import se.kth.iv1305.vehicleinspection.integration.InspectionCatalog;

/**
 *
 * @author taoudi
 */
public class PrintoutTest {

    public PrintoutTest() {
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
     * Test of getTextList method, of class Printout.
     */
    @Test
    public void testGetTextListEmptyList() {
        InspectionCatalog inspectionCatalog = new InspectionCatalog();
        Printout instance = new Printout(inspectionCatalog);
        ArrayList<String> result = instance.getTextList();
        ArrayList<String> expResult = new ArrayList<>();
        assertEquals("Does not return an empty list", expResult, result);
    }

    /**
     * Test of getTextList method, of class Printout.
     */
    @Test
    public void testGetTextList() {
        InspectionCatalog inspectionCatalog = new InspectionCatalog();
        inspectionCatalog.storeResult(true);
        inspectionCatalog.storeResult(false);
        Printout instance = new Printout(inspectionCatalog);
        ArrayList<String> result = instance.getTextList();
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Passed");
        expResult.add("Failed");
        assertEquals("Does not return the correct list", expResult, result);
    }
}
