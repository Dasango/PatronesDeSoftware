package uce.proxy;

import static uce.proxy.dinamic.OperacionesFactoryProxy.*;
import uce.proxy.impl.OperacionesCadenasReal;
import uce.proxy.impl.OperacionesHablarReal;
import uce.proxy.impl.OperacionesNumerosProxy;
import uce.proxy.impl.OperacionesNumerosReal;
import uce.proxy.inter.OperacionesCadenas;
import uce.proxy.inter.OperacionesHablar;
import uce.proxy.inter.OperacionesNumeros;



public class AppProxy {
    public static void main(String[] args) {

        registrar(OperacionesNumeros.class,
                OperacionesNumerosReal.class);

        OperacionesNumeros op = crear(OperacionesNumeros.class);


        registrar(OperacionesHablar.class,
                OperacionesHablarReal.class);

        OperacionesHablar op1 = crear(OperacionesHablar.class);

        int sol = op.sumar(1, 3);
        System.out.println(sol);

        String sol1 = op1.saludo();
        System.out.println(sol1);
       // op2.may("Holaaa");


    }
}
