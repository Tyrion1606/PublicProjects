package my.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton myButton = new JButton("MY BUTTON 1");
    JButton myButton2 = new JButton("MY BUTTON 2");



    MyFrame(){

        //myButton.setBounds((int)(this.getWidth()*0.1),(int)(this.getHeight()*0.1), (int)(this.getWidth()*0.2), (int)(this.getHeight()*0.2));
        myButton.setBounds(100, 50, 300, 100);
        myButton.addActionListener(
            (e) -> System.out.println("click 1")
        );

        myButton2.setBounds(100, 150, 300, 100);
        myButton2.addActionListener(
            (e) -> System.out.println("click 2")
        );


        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLayout(null);
        this.setVisible(true);
    }
}
