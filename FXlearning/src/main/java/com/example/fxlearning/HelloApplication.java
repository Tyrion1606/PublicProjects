package com.example.fxlearning;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("HelloApplication.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

/*
        scene.setFill(Color.ANTIQUEWHITE);
        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("[TITULO]");
        Text text = new Text(100, 100, "[texto]");
        text.setFont(Font.font("verdana", 50));
        root.getChildren().add(text);
        stage.getMaxWidth();
        Line line = new Line(50,50,500,50);
        line.setStrokeWidth(10);
        root.getChildren().add(line);*/


/*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/
    }
}
