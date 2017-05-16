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
import se.kth.iv1305.vehicleinspection.integration.Printer;

/**
 *
 * @author taoudi
 */
public class InspectionTest {

    public InspectionTest() {
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
     * Test of printReceipt method, of class Inspection. Tests if the method is
     * executed
     */
    @Test
    public void testPrintReceipt() {
        Inspection instance = new Inspection(new Payment(new VehicleDTO(""), new Discount(false)), new Printer());
        instance.printReceipt();
    }

}
