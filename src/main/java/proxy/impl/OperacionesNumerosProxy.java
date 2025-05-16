package uce.proxy.impl;

import uce.proxy.inter.OperacionesNumeros;

public class OperacionesNumerosProxy implements OperacionesNumeros {

    private OperacionesNumerosReal target = new OperacionesNumerosReal();





    @Override
    public int sumar(int x, int y) {
        System.out.println("Añadiendo inforamción en el proxy antes...");
        int sum = target.sumar(x,y);
        System.out.println("Añadiendo inforamción en el proxy después...");
        return sum;
    }

    @Override
    public int restar(int x, int y) {
        System.out.println("Añadiendo inforamción en el proxy antes...");
        int res = target.restar(x,y);
        System.out.println("Añadiendo inforamción en el proxy después...");
        return res;
    }
}
