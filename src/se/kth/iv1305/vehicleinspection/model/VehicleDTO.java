/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

import java.util.ArrayList;
import se.kth.iv1305.vehicleinspection.model.VehiclePart;

/**
 *
 * @author taoudi
 */
public final class VehicleDTO {

    private ArrayList<VehiclePart> listOfParts = new ArrayList<>();
    private final String regNumber;
    private int inspectedParts = 0;

    /**
     * Creates new instance of a particular vehicle
     *
     * @param listOfParts is the list of parts to inspect
     * @param regNumber is the registration number for the vehicle
     * @param inspectedParts are the amount of parts that have been inspected
     */
    public VehicleDTO(String regNumber) {       
        addParts();
        this.regNumber = regNumber;
    }

    /**
     *
     * @return amount of parts that will be inspected
     */
    public int getListSize() {
        int listSize = this.listOfParts.size();
        return listSize;
    }
    
  

    /**
     *
     * @return Registration number of vehicle
     */
    public String getRegNumber() {
        return regNumber;
    }

   private void addParts(){
       listOfParts.add(new VehiclePart("Brake"));
       listOfParts.add(new VehiclePart("Clutch"));
       listOfParts.add(new VehiclePart("Engine"));
       listOfParts.add(new VehiclePart("Exhaust"));
    
   }

    /**
     *
     * @return returns a vehicle part as a string from the list of available
     * parts if there are no more parts to inspect, it returns "No more
     * inspections." as a string.
     */
   public VehiclePart findPart(){
       return listOfParts.get(inspectedParts++);
   }
   
   public ArrayList<VehiclePart> getListOfParts(){
       return listOfParts;
   }
}
