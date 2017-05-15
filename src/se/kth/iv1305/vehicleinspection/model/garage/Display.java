/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model.garage;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * A singleton that controls the queue number display outside the garage..
 */
class Display {
    private static final Display DISPLAY = new Display();
    private static String HEADER = "Now Serving:";
    private int queueNumber = -1;
    private JLabel queueNumberLabel = new JLabel("", SwingConstants.CENTER);

    /**
     * Connects to the queue number display and shows the number
     * <code>zero</code>.
     */
        private Display() {
        nextNumber();
        contactDisplay();
    }
        
        public static Display getDisplay(){
            return DISPLAY;
        }

    /**
     * Increments the displayed number.
     */
    final void nextNumber() {
        queueNumberLabel.setText(Integer.toString(++queueNumber));
    }

    private void contactDisplay() {
        JFrame frame = new JFrame(HEADER);
        Font labelFont = new Font(Font.SERIF, Font.BOLD, 30);
        queueNumberLabel.setFont(labelFont);
        frame.getContentPane().setBackground(Color.BLACK);
        queueNumberLabel.setForeground(Color.WHITE);
        frame.getContentPane().add(queueNumberLabel);
        frame.setBounds(600, 0, 200, 80);
        frame.setVisible(true);
    }
}
