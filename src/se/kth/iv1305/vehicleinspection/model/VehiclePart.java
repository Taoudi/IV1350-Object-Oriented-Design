/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

/**
 * Contains information of a part of a vehicle
 */
public class VehiclePart {

    private final String part;

    /**
     *
     * @param part - name of the vehicle part
     */
    public VehiclePart(String part) {
        this.part = part;
    }

    /**
     *
     * @return Return the vehicle part as a <code>String</code>
     */
    public String toString() {
        return this.part;
    }
}
