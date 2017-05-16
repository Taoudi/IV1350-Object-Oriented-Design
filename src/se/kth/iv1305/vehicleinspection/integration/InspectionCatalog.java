/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.integration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * InspectionCatalog holds an arraylist of all results
 */
public class InspectionCatalog {

    private final ArrayList<Result> resultList = new ArrayList<>();
    private List<ResultObserver> resultObservers = new ArrayList<>();
    private int arrayIndex = 0;

    /**
     * results are stored in a list
     *
     * @param inspectionPassed - true = passed, false = failed
     */
    public void storeResult(boolean inspectionPassed) {
        Result result = new Result(inspectionPassed);
        resultList.add(result);
        notifyObservers();
    }

    /**
     * @return the list of results
     */
    public ArrayList<Result> getResultList() {
        return resultList;
    }

    private void notifyObservers() {
        for (ResultObserver obs : resultObservers) {
            obs.newResult(resultList.get(arrayIndex++));
        }
    }

    /**
     * Any <code>ResultObserver</code> that is passed to this method will be
     * notified when a result is stored in catalog
     *
     * @param obs instance of ResultObserver
     */
    public void addResultObserver(ResultObserver obs) {
        resultObservers.add(obs);
    }

    /**
     * Is needed if several instances of ResultObserver exists
     *
     * @param observers List of instances of ResultObserver
     */
    public void addResultObservers(List<ResultObserver> observers) {
        resultObservers.addAll(observers);
    }

}
