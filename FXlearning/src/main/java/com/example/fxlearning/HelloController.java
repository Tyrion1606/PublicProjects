package com.example.fxlearning;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.util.Random;

public class HelloController {

    Random rand = new Random();

    @FXML
    private Button myButton;
    private double x;
    private double y;
    private Integer counter = 3;
    private double buttonRadiusX;
    private double buttonRadiusY;

    @FXML
    private AnchorPane myAnchorPane;


    @FXML
    protected void onButtonClick() {
        System.out.println("click");

        buttonRadiusX = myButton.getWidth()/2;
        buttonRadiusY = myButton.getHeight()/2;

        x = rand.nextDouble(buttonRadiusX, myAnchorPane.getWidth()-buttonRadiusX);
        System.out.println("X: " + x);
        myButton.setLayoutX(x);
        y = rand.nextDouble(buttonRadiusY, myAnchorPane.getHeight()-buttonRadiusY);
        System.out.println("Y: " + y);
        myButton.setLayoutY(y);

        counter--;
        myButton.setText(counter.toString());

        if (counter < 0){
            counter = 3;
            myButton.setText(counter.toString());
            myButton.setScaleX(myButton.getScaleX()*0.7);
            myButton.setScaleY(myButton.getScaleY()*0.7);
        }


    }
}