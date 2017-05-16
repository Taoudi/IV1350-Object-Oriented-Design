/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This class handles the log
 */
public class LogHandler {

    private static final String FILE_NAME = "vehicle-inspection-log";
    private PrintWriter logFile;

    /**
     * Creates new PrintWriter
     *
     * @throws IOException - Exception produced by failed I/O operation
     */
    public LogHandler() throws IOException {
        logFile = new PrintWriter(new FileWriter(FILE_NAME), true);
    }

    /**
     * Write the log entries
     *
     * @param exception the log entry
     */
    public void logException(Exception exception) {
        logFile.println("Exception was thrown: " + exception.getMessage());
        exception.printStackTrace(logFile);
    }
}
