
package com.inter;

import java.util.Random;

public class CarroBasico implements Cloneable {

    protected String nombreModelo;
    public int precio;

    public CarroBasico() {

    }

    public int getPrecio() {
        return precio;
    }

    public int setPrecio() {
        int p = 0;
        Random r = new Random();
        p = r.nextInt(1000);
        precio = p;
        return p;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public CarroBasico clone() throws CloneNotSupportedException {
        return (CarroBasico)  super.clone();
    }

    @Override
    public String toString() {
        return "CarroBasico{" +
                "nombreModelo='" + nombreModelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
