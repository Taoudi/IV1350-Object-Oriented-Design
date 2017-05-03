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
import se.kth.iv1305.vehicleinspection.model.Amount;
import se.kth.iv1305.vehicleinspection.model.CardDTO;

/**
 *
 * @author taoudi
 */
public class PaymentAuthorizationSystemTest {
    
    public PaymentAuthorizationSystemTest() {
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
     * Test of authorizePayment method, of class PaymentAuthorizationSystem.
     * Should never equals false
     */
    @Test
    public void testAuthorizePayment() {
        CardDTO card = null;
        Amount amount = null;
        boolean expResult = false;
        boolean result = PaymentAuthorizationSystem.authorizePayment(card, amount);
        assertNotEquals(expResult, result);    
    }
    
}
