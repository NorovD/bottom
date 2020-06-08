package ru.geekbrains.homework.exitBottom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow extends JFrame {

    public NewWindow() {
        setVisible(true);
        setLocation(800, 400);
        setSize(500, 500);
        setResizable(false);
        JButton btn1 = new JButton("re-Open");
        add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyWindow();
            }
        });






    }
}
