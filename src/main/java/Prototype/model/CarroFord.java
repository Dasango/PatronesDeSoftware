package com.model;

import com.inter.CarroBasico;

public class CarroFord extends CarroBasico {
    public CarroFord(String m) {
        this.nombreModelo = m;
    }
    @Override
    public  CarroBasico clone() throws CloneNotSupportedException{
        return (CarroBasico)  super.clone();
    }
}
