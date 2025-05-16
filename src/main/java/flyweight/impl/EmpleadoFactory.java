package uce.flyweight.impl;

import uce.flyweight.inter.IEmpleado;

import java.util.HashMap;

public class EmpleadoFactory {
    private static HashMap<String, IEmpleado> mapa = new HashMap<>();

    public static IEmpleado getIEmpleado(String tipo) {

        IEmpleado p = null;
        if (mapa.get(tipo) != null) {
            p = mapa.get(tipo);


        } else {
            switch (tipo) {

                case "Desarrollador":
                    p = new Desarrolador();
                    break;
                case "Tester":
                    p = new Tester();
                    break;
                default:
                    System.out.println("No existe el tipo " + tipo + " xd.");


            }


        }
        mapa.put(tipo, p);
        return p;
    }

}
