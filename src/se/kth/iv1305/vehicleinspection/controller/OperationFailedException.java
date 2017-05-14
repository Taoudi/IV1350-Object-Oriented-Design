/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.controller;

/**
 *
 * @author taoudi
 */
public class OperationFailedException extends RuntimeException {
    
     /**
     * Creates a new instance with the specified message and root cause.
     *
     * @param msg   The exception message.
     * @param cause The exception that caused this exception.
     */
    public OperationFailedException (String msg, Exception cause){
        super(msg,cause);
    }
}
