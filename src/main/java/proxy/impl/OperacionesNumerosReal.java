package uce.proxy.impl;

import uce.proxy.inter.OperacionesNumeros;

public class OperacionesNumerosReal implements OperacionesNumeros {
    @Override
    public int sumar(int x, int y) {
        return x+y;
    }

    @Override
    public int restar(int x, int y) {
        return x-y;
    }
}
