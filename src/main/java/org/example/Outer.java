package org.example;
import java.awt.*;
import java.awt.event.*;
public class Outer implements MouseWheelListener{
    AEvent2 obj;
    Outer(AEvent2 obj){
        this.obj=obj;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        obj.b.setBounds(120,120,100,30);
        obj.tf.setText("sadsadsad");
        //obj.tf.setText(":-)");
    }
}
