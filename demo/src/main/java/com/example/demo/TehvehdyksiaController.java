package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class TehvehdyksiaController {
    @FXML
    Label label;

    @FXML
    public void onClickAamu(){
        label.setText("Hyvää huomenta!");
    }
    @FXML
    public void onClickPaiva(){
        label.setText("Hyvää päivää!");
    }
    @FXML
    public void onClickIlta(){
        label.setText("Hyvää iltaa!");
    }
    @FXML
    public void onClickYo(){label.setText("Hyvää yötä!");}

}