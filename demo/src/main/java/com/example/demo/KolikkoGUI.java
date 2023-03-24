package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class KolikkoGUI extends Application {
    @Override
    public void start(Stage stage1) throws IOException {
        FXMLLoader fxmlLoader1 = new FXMLLoader(KolikkoGUI.class.getResource("kolikko-view.fxml"));

        Scene scene1 = new Scene(fxmlLoader1.load(), 420, 240);
        stage1.setTitle("Kolikko");
        stage1.setScene(scene1);
        stage1.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
