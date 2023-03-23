package com.example.demo.model;

import com.example.demo.TehvehdyksiaApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Noppa extends Application {
    public int heita(int sivuLkm){return sivuLkm;};

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TehvehdyksiaApplication.class.getResource("noppa-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 240);
        primaryStage.setTitle("Noppa!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
