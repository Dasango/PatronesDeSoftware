package com.model;

import com.inter.CarroBasico;

public class CarroHyndai extends CarroBasico {

    public CarroHyndai(String m) {
        this.nombreModelo = m;
    }

    @Override
    public CarroBasico clone() throws CloneNotSupportedException {
        return (CarroBasico) super.clone();
    }

}
