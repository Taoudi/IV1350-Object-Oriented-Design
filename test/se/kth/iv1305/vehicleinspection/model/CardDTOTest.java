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
public class CardDTOTest {

    public CardDTOTest() {
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
     * Test of getCVC method, of class CardDTO.
     */
    @Test
    public void testGetCVC() {
        CardDTO creditCard = new CardDTO(1324, "12345678", "hejsan", 123, 832);
        int expResult = 832;
        int result = creditCard.getCVC();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExpiryDate method, of class CardDTO.
     */
    @Test
    public void testGetExpiryDate() {
        CardDTO creditCard = new CardDTO(1324, "12345678", "hejsan", 123, 832);
        int expResult = 123;
        int result = creditCard.getExpiryDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCardHolder method, of class CardDTO.
     */
    @Test
    public void testGetCardHolder() {
        CardDTO creditCard = new CardDTO(1324, "", "", 123, 832);
        String expResult = "";
        String result = creditCard.getCardHolder();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumber method, of class CardDTO.
     */
    @Test
    public void testGetNumber() {
        CardDTO creditCard = new CardDTO(1324, "", "hejsan", 123, 832);
        String expResult = "";
        String result = creditCard.getNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPin method, of class CardDTO.
     */
    @Test
    public void testGetPin() {
        CardDTO creditCard = new CardDTO(1324, "12345678", "hejsan", 123, 832);
        int expResult = 1324;
        int result = creditCard.getPin();
        assertEquals(expResult, result);
    }

}
