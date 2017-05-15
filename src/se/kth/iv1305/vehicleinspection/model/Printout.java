/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

import se.kth.iv1305.vehicleinspection.integration.InspectionCatalog;
import java.util.ArrayList;

/**
 *
 * Printout contains the result of the inspection in the form of a string list
 */
public final class Printout {

    private final ArrayList<String> text = new ArrayList<>();

    /**
     * Uses the results stored in inspectionCatalog to create a new list of
     * strings (Printout) that will be printed out
     *
     * @param inspectionCatalog - Where the results are stored
     */
    public Printout(InspectionCatalog inspectionCatalog) {
        setList(inspectionCatalog);
    }

    /**
     *
     * @return the list of strings that will be printed out
     */
    public ArrayList<String> getTextList() {
        return text;
    }

    /**
     *
     * @param inspectionCatalog where the results are stored
     * @return An <code>ArrayList</code> of strings with "Passed" or "Failed" at
     * every index.
     */
    private void setList(InspectionCatalog inspectionCatalog) {
        for (int i = 0; i < inspectionCatalog.getResultList().size(); i++) {
            if (inspectionCatalog.getResultList().get(i).getBoolean() == true) {
                text.add(i, "Passed");
            } else {
                text.add(i, "Failed");
            }

        }

    }
}
