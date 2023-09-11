package org.example;

import java.awt.*;
import java.awt.event.ActionListener;

public class AEvent2 extends Frame {
    TextField tf;
    TextField tf2;

    TextField tf3;

    TextField tf4;

    TextField tf5;

    TextField tf6;
    Button b;
    Button a;

    Button c;
    AEvent2(){
//создавать компоненты
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        tf2 = new TextField();
        tf2.setBounds(60,100,170,20);
        tf3 = new TextField();
        tf3.setBounds(400,50,170,20);
        b = new Button("plus");
        b.setBounds(60,150,80,30);
        a = new Button("Don't click me");
        a.setBounds(60,700,80,30);

        tf4 = new TextField();
        tf4.setBounds(400,200,170,20);
        tf5 = new TextField();
        tf5.setBounds(400,250,170,20);
        tf6 = new TextField();
        tf6.setBounds(400,300,170,20);
        c = new Button("Color");
        c.setBounds(400,350,170,20);
//зарегистрировать прослушиватель
        Outer o = new Outer(this);
        b.addMouseWheelListener(o);
        Outer2 o2 = new Outer2(this);
        b.addActionListener(o2);//передача экземпляра внешнего класса
        Outer3 o3 = new Outer3(this);
        a.addMouseMotionListener(o3);
        Outer4 o4 = new Outer4(this);
        c.addActionListener(o4);
//добавлять компоненты и устанавливать размер, макет и видимость
        add(tf);
        add(tf2);
        add(tf3);
        add(b);
        add(a);
        add(c);
        add(tf4);
        add(tf5);
        add(tf6);
        setSize(1000,1000);
        setLayout(null);
        setVisible(true);
    }
}
