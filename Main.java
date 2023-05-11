package com.company;

import javax.swing.*;
import java.awt.*;

class Main {

    public static void main(String args[]) {

        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set the jframe size and location, and make it visible
        myFrame.setSize(new Dimension(800, 600));

        MyPanel panel = new MyPanel();

        myFrame.add(panel);

        myFrame.setVisible(true);

    }




}
