package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TehvehdyksiaApplication extends Application {
    @Override
    public void start(Stage stage1) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TehvehdyksiaApplication.class.getResource("tehvehdyksia-view.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 420, 240);
        stage1.setTitle("Tervehdyksiä!");
        stage1.setScene(scene1);
        stage1.show();

    }

    public static void main(String[] args) {
        launch();
    }
}