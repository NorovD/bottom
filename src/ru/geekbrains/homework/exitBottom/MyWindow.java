package ru.geekbrains.homework.exitBottom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyWindow extends JFrame {
    public MyWindow(){
        setVisible(true);
        setLocation(700,300);
        setSize(500,500);

        JButton btn1 = new JButton("Exit");
        JButton btn2 = new JButton("Call new window");

        add(btn1);
        JPanel btnPanel = new JPanel(new GridLayout(1,1));

        btnPanel.add(btn1);
        btnPanel.add(btn2);

        add(btnPanel, BorderLayout.CENTER);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NewWindow();
            }
        });
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
