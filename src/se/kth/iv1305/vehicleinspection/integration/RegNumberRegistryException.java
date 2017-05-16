/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.integration;

/**
 * Thrown when something goes wrong while performing an operation in the
 * <code>RegNumberResgistry</code>. The message might contain more information
 * about the error condition.
 */
public class RegNumberRegistryException extends Exception {

    /**
     * Creates a new instance representing the condition described in the
     * specified message.
     *
     * @param msg A message that describes what went wrong.
     */
    public RegNumberRegistryException(String msg) {
        super(msg);
    }
}
