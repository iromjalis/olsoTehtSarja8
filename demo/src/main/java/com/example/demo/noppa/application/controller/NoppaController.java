package com.example.demo.noppa.application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class NoppaController {
    int i, h;
    @FXML
    Label text;

    @FXML
    public void onClickHeita(){
        int max=6, min=1;
        i = (int) ((Math.random() * (max - min)) + min);
        h++;
        System.out.println("Tulos "+i+" Heittokertoja "+h);
        text.setText("Tulos "+i+". Heittokertoja "+h);
    }
}
