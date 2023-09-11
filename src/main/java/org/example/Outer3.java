package org.example;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Outer3 implements MouseMotionListener {
    AEvent2 obj;
    Outer3(AEvent2 obj){
        this.obj=obj;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Rectangle arr = obj.a.getBounds();
        obj.a.setBounds((int) (Math.random()*800),(int) (Math.random()*800),80,30);
        Color color = new Color((int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255));
        obj.setBackground(color);
        obj.tf4.setText(String.valueOf(color.getRed()));
        obj.tf5.setText(String.valueOf(color.getGreen()));
        obj.tf6.setText(String.valueOf(color.getBlue()));
    }

}
