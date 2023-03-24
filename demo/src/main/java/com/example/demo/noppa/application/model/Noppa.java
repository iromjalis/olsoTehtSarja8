package com.example.demo.noppa.application.model;

import com.example.demo.IView;

public class Noppa implements IView {
    int heittokerros = 0;

    public int heita(int sivuLkm) {
        int max = sivuLkm, min = 1;
        int random = (int) ((Math.random() * (max - min)) + min);
        return random;
    }

    ;

    public int getHeittojenLkm() {
        heittokerros += 1;
        return heittokerros;
    }


}
