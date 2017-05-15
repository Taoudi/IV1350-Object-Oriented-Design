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
public class PaymentTest {
    
    public PaymentTest() {
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
     * Test of getCost method, of class Payment.
     * Verifies that the correct cost is calculated.
     */
    @Test
    public void testGetCost() {
        VehicleDTO vehicle = new VehicleDTO("");
        Payment instance = new Payment(vehicle);
        double expResult = vehicle.getListSize()*100;
        double result = instance.getCost().getAmountAsDouble();
        assertEquals("The price should be the amounr of vehicle parts times the cost per part"
                ,expResult, result, 400);  
    }
    
}
