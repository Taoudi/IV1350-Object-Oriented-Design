/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.integration;
import se.kth.iv1305.vehicleinspection.model.CardDTO;
import se.kth.iv1305.vehicleinspection.model.Amount;
/**
 * Handles all communication with the payment authorization system.
 */
public class PaymentAuthorizationSystem {

    /**
     * Requests authorization for the specified payment.
     *
     * @param card   The card used for the payment.
     * @param amount The amount to pay.
     * @return <code>true</code> if the payment is authorized,
     *         <code>false</code> if it is not. This dummy implementation always
     *         returns <code>true</code>.
     */
    public boolean authorizePayment(CardDTO card, Amount amount) {
        return true;
    }
}
