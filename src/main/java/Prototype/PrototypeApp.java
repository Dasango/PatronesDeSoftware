package com;

import com.inter.CarroBasico;
import com.model.CarroFord;
import com.model.CarroHyndai;

public class PrototypeApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        CarroBasico hyndai = new CarroHyndai("i10");
        CarroBasico ford = new CarroFord("T");
        hyndai.precio= 30000;
        ford.precio=1;
        CarroBasico forClone = ford.clone();
        CarroBasico hynClone = hyndai.clone();
        hynClone.setPrecio();
        System.out.println(hyndai);
        System.out.println(ford);

        System.out.println(forClone);
        System.out.println(hynClone);

    }
}
