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
import se.kth.iv1305.vehicleinspection.model.Printout;
import se.kth.iv1305.vehicleinspection.model.Receipt;
import se.kth.iv1305.vehicleinspection.model.VehicleDTO;

/**
 *
 * @author taoudi
 */
public class PrinterTest {
    
    public PrinterTest() {
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
     * Test of printReceipt method, of class Printer.
     */
    @Test
    public void testPrintReceipt() {
        Receipt receipt = null;
        Printer instance = new Printer();
        instance.printReceipt(receipt);
    }

    /**
     * Test of printPrintout method, of class Printer.
     */
    @Test
    public void testPrintPrintout() {
        Printout printout = null;
        VehicleDTO vehicle = null;
        Printer instance = new Printer();
        instance.printPrintout(printout, vehicle);

    }
    
}
