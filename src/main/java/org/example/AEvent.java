package org.example;
import java.awt.*;
import java.awt.event.*;
public class AEvent extends Frame implements FocusListener{
    TextField tf;
    AEvent(){

//create components
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);

//register listener
        //b.addActionListener(this);//passing current instance
        b.addFocusListener(this);
//add components and set size, layout and visibility
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }

    @Override
    public void focusGained(FocusEvent e) {
        tf.setText("Мышь наведена");
    }

    @Override
    public void focusLost(FocusEvent e) {
        tf.setText("Мышь не наведена");
    }
}
