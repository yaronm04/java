package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class MyPanel extends JPanel {
        JButton noord = new JButton("klik");

    public MyPanel() {
            setLayout(new BorderLayout());
            setBackground(Color.darkGray);
            setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JPanel northPanel = new JPanel();
            noord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.out.println("Klik!");
                    }
            });
            northPanel.add(noord);
            northPanel.add(new JButton("ook klik maar anders"));
            add(northPanel, BorderLayout.NORTH);

            JButton buttonC = new JButton("Link naar YouTube");
            buttonC.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://youtu.be/dQw4w9WgXcQ"));
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                }
            });
            add(buttonC, BorderLayout.CENTER);

            add(new JButton("Z"), BorderLayout.SOUTH);
            add(new JButton("Z"), BorderLayout.SOUTH);
    }
}