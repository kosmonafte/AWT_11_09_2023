package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Outer2 implements ActionListener {
    AEvent2 obj;
    Outer2(AEvent2 obj){
        this.obj=obj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        obj.tf3.setText(String.valueOf(Integer.parseInt(obj.tf.getText()) + Integer.parseInt(obj.tf2.getText())));
//        obj.b.setBounds(100,120,80,30);
//        obj.tf.setText("");
    }
}
