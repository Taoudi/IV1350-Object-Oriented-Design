/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.view;


import se.kth.iv1305.vehicleinspection.integration.Result;
import se.kth.iv1305.vehicleinspection.integration.ResultObserver;

/**
 *
 * @author taoudi
 */
 class InspectionStatsView implements ResultObserver {

    private int noOfPassedInspections = 0;
    private int noOfFailedInspections = 0;

    /**
     * calls the method to print the current amount of passed/failed results 
     * and the method for updating the amount of inspectionts passd/failed
     * @param result 
     */
    @Override
    public void newResult(Result result) {
        updateResults(result);
        printCurrentState();
    }

    private void updateResults(Result result) {
        if (result.getBoolean() == true) {
            noOfPassedInspections++;
        } else if (result.getBoolean() == false) {
            noOfFailedInspections++;
        }
    }

    private void printCurrentState() {
        System.out.println("#### Amount of inspections passed/failed ####");
        System.out.println("Number of failed inspections: " + noOfFailedInspections);
        System.out.println("Number of passed inspections: " + noOfPassedInspections);
    }
}
    

