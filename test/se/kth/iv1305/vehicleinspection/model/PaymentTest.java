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
    public void testGetCostWithDiscount() {
        VehicleDTO vehicle = new VehicleDTO("");
        Discount discount = new Discount(false);
        Payment instance = new Payment(vehicle, discount);
        double result = instance.getAmount().getAmountAsDouble();
        if(result == 400||result == 320)
        assertTrue(true);
        else
            fail();
    }
    
}
