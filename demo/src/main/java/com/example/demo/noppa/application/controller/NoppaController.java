package com.example.demo.noppa.application.controller;

import com.example.demo.noppa.application.model.Noppa;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class NoppaController extends Noppa {
    int silmaluku, heittokerros, summa;
    @FXML
    Label text;

    @FXML
    public void onClickHeita() {
        heittokerros = getHeittojenLkm();
        silmaluku = heita(6);
        System.out.println("Tulos " + silmaluku + " Heittokertoja " + heittokerros);
        text.setText("Tulos " + silmaluku + ". Heittokertoja " + heittokerros);
    }

    @FXML
    public void onClickHeitaViisi() {
        int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0;
        heittokerros = getHeittojenLkm();
        r1 = heita(6);
        r2 = heita(6);
        r3 = heita(6);
        r4 = heita(6);
        r5 = heita(6);
        summa = r1 + r2 + r3 + r4 + r5;
        System.out.println("Nopista tuli: " + r1 + "," + r2 + "," + r3 + "," + r4 + "," + r5 + "." + " Summa " + summa + ".\n\nHeittokertoja " + heittokerros);
        text.setText("Nopista tuli: " + r1 + "," + r2 + "," + r3 + "," + r4 + "," + r5 + ". " + "Summa " + summa + ".\n\nHeittokertoja " + heittokerros);
    }

    public void onClickNoppa() {
        heittokerros = getHeittojenLkm();
        silmaluku = (int) Math.round(Math.random());

        System.out.println(silmaluku);
        if (silmaluku == 0) {
            text.setText("Kruuna. Heittokertoja " + heittokerros);
        } else text.setText("Klaava. Heittokertoja " + heittokerros);
    }
}
