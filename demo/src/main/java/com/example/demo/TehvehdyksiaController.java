package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TehvehdyksiaController {
    @FXML
    Label label;
    @FXML
    private Label welcomeText;

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
    public void onClickYo(){
        label.setText("Hyvää yötä!");
    }
}