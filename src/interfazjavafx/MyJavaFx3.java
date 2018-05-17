/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class MyJavaFx3 extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("BorderPane");
        BorderPane root = new BorderPane();
        root.setTop(new Button("Top"));
        root.setRight(new Button("Right"));
        root.setBottom(new Button("Bottom"));
        root.setLeft(new Button("Left"));
        root.setCenter(new Button("Center"));
        Scene scene = new Scene(root, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



public static void main(String[] args) {
        Application.launch(args);
    }
}