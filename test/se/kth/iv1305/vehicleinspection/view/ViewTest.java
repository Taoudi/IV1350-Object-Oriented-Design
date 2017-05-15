/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1305.vehicleinspection.controller.Controller;
import se.kth.iv1305.vehicleinspection.integration.PaymentAuthorizationSystem;
import se.kth.iv1305.vehicleinspection.integration.Printer;
import se.kth.iv1305.vehicleinspection.integration.RegistryCreator;
import se.kth.iv1305.vehicleinspection.model.garage.Garage;

/**
 *
 * @author taoudi
 */
public class ViewTest {
    
    public ViewTest() {
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
     * Test of sampleExecution method, of class View.
     * Tests if the method executes without failing.
     */
    @Test
    public void testSampleExecution() throws Exception {     
        View instance = new View(new Controller(new RegistryCreator(),new Garage(),new Printer(), new PaymentAuthorizationSystem()));
        instance.sampleExecution();
    }
    
}
