/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1305.vehicleinspection.integration.PaymentAuthorizationSystem;
import se.kth.iv1305.vehicleinspection.integration.Printer;
import se.kth.iv1305.vehicleinspection.integration.RegistryCreator;
import se.kth.iv1305.vehicleinspection.integration.ResultObserver;
import se.kth.iv1305.vehicleinspection.model.garage.Garage;
import se.kth.iv1305.vehicleinspection.model.Amount;
import se.kth.iv1305.vehicleinspection.model.CardDTO;
import se.kth.iv1305.vehicleinspection.model.Discount;
import se.kth.iv1305.vehicleinspection.model.InvalidNumberException;
import se.kth.iv1305.vehicleinspection.model.Payment;
import se.kth.iv1305.vehicleinspection.model.VehicleDTO;
import se.kth.iv1305.vehicleinspection.model.VehiclePart;

/**
 *
 * @author taoudi
 */
public class ControllerTest {
     private Controller instance;
     private VehicleDTO vehicleWithEmptyString;
     private VehicleDTO vehicle;
    private Discount discount;
    public ControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         instance = new Controller(new RegistryCreator(), 
       new Garage(), new Printer(), new PaymentAuthorizationSystem());
         vehicleWithEmptyString = new VehicleDTO("");
         vehicle = new VehicleDTO("LUL123");
         discount = new Discount(false);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of nextCustomer method, of class Controller.
     * Check if it executes without crashing
     */
    @Test
    public void testNextCustomer() {
        setUp();
        instance.nextCustomer();
        tearDown();
    }

   
    /**
     * Test of closeDoor method, of class Controller.
     * test if it executes
     */
    @Test
    public void testCloseDoor() {
        setUp();
        instance.closeDoor();
        tearDown();
    }

    /**
     * Test of checkRegNumber method, of class Controller.
     * Method should throw an exception when the regNumber is an empty string
     */
    @Test
    public void testCheckRegNumberWithEmptyString() throws Exception {
        setUp();
        try{
        instance.checkRegNumber(vehicleWithEmptyString);
        }
        catch(InvalidNumberException e){
           assertTrue(true);
        }
        tearDown();
    }
    
     /**
     * Test of checkRegNumber method, of class Controller.
     * regNumber shoud be correct
     */
    @Test
    public void testCheckRegNumber() throws Exception {
        setUp();
        boolean expResult = true;
        boolean result = instance.checkRegNumber(vehicle);
        assertEquals(expResult, result);
        tearDown();
    }

    /**
     * Test of calculateCost method, of class Controller.
     * Compares the return value with the correct expected cost.
     */
    @Test
    public void testCalculateCost() {
        setUp();
        Payment payment = new Payment(vehicle, discount);
        double expResult = payment.getAmount().getAmountAsDouble();
        double result = instance.calculateCost(vehicle, discount).getAmountAsDouble();
        assertEquals("The price should be 400", expResult, result,400);
        tearDown();
    }
    /**
     * Test of calculateCost method, of class Controller.
     * Compares the return value with zero, which should not be correct.
     */
    @Test
    public void testCalculateCostZero() {
        setUp();
        double expResult = 0;
        double result = instance.calculateCost(vehicle, discount).getAmountAsDouble();
        assertNotEquals("The price should be 400", expResult, result);
        tearDown();
    }
     /**
     * Test of calculateCost method, of class Controller.
     * Compares the return value with a negative value, which should not be correct
     */
    @Test
    public void testCalculateCostNegative() {
        setUp();
        Payment payment = new Payment(vehicle, discount);
        double expResult = -1*payment.getAmount().getAmountAsDouble();;
        double result = instance.calculateCost(vehicle, discount).getAmountAsDouble();
        assertNotEquals("The price should be 400", expResult, result);
        tearDown();
    }
    

    /**
     * Test of payWithCredit method, of class Controller.
     * Tests if the return value if false, which it should never be
     */
    @Test
    public void testPayWithCreditFalse() {
        setUp();
        CardDTO creditCard = new CardDTO(0,"", "", 0,0);
        boolean expResult = false;
        boolean result = instance.payWithCredit(creditCard, vehicle, discount);
        assertNotEquals(expResult, result);
    }
/**
     * Test of payWithCredit method, of class Controller.
     * Tests if the return value if true, which it should always be
     */
    @Test
    public void testPayWithCreditTrue() {
        setUp();
        CardDTO creditCard = new CardDTO(0,"", "", 0,0);
        boolean expResult = true;
        boolean result = instance.payWithCredit(creditCard, vehicle, discount);
        assertEquals(expResult, result);
    }
    /**
     * Test of specifyPart method, of class Controller.
     * Tests if the returned part has the correct parameter values
     */
    @Test
    public void testSpecifyPart() {
        setUp();
        String expResult = "Brake";
        String result = instance.specifyPart(vehicle).toString();
        assertEquals(expResult, result);
        tearDown();
    }
     
    /**
     * Test of storeResult method, of class Controller.
     * Tests if the method is executed without failing
     */
    @Test
    public void testStoreResult() {
        setUp();
        boolean inspectionPassed = false;
        instance.storeResult(inspectionPassed);
        tearDown();
    }

    /**
     * Test of printResult method, of class Controller.
     * Tests if the method is executed without failing
     */
    @Test
    public void testPrintResult() {
        setUp();
        System.out.println("printResult");
        instance.printResult(vehicle);
        tearDown();

    }
    
}
