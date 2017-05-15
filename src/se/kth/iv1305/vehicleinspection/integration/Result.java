/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.integration;

/**
 *
 * Gives the result of the inspection, its either pass or fail
 */
public class Result {

    private  boolean didItPass;

    /**
     *
     * @param didItPass - <code>true</code> if it passed, <code>false</code> if it failed.
     */
    public Result(boolean didItPass) {
        this.didItPass = didItPass;
    }

    /**
     *
     * @return returns the result as a boolean
     */
    public boolean getBoolean() {
        return this.didItPass;
    }    

}
