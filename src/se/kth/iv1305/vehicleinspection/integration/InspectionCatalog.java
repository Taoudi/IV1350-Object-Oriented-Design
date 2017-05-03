/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.integration;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * InspectionCatalog holds an arraylist of all results
 */
public class InspectionCatalog {
 private final ArrayList<Result> resultList = new ArrayList<>();
 
 /**
  * results are stored in a list
  * @param inspectionPassed - true = passed, false = failed
  */
    public void storeResult(boolean inspectionPassed){
        Result result = new Result(inspectionPassed);
        resultList.add(result);
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Result> getResultList(){
        return resultList;
    }

   
    
}
