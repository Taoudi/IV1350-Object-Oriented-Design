/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.view;

/**
 *
 * This class is responsible for showing error messages to the user.
 */
class ErrorMessageHandler {

    /**
     * Displays the specified error message.
     *
     * @param msg The error message.
     */
    void showErrorMessage(String msg) {
        System.out.println("ERROR: " + msg);
    }

}
