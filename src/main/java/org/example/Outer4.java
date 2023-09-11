package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Outer4 implements ActionListener {
    AEvent2 obj;
    Outer4(AEvent2 obj){
        this.obj = obj;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Color color = new Color(Integer.parseInt(obj.tf4.getText()), Integer.parseInt(obj.tf5.getText()), Integer.parseInt(obj.tf6.getText()));
        obj.setBackground(color);
    }
}
