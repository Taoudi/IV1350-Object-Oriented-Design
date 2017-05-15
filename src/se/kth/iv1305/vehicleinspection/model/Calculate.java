/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

/**
 *
 * Interface for calculating the cost of the inspection
 */
public interface Calculate {
    /**
     * Calculates the cost for an  insatnce of an inspection
     * @param vehicle The vehicle that is inspected in this instance
     * @return the cost as an instance of Amount
     */
    Amount cost(VehicleDTO vehicle);
}
