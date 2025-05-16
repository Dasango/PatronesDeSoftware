package uce.flyweight.impl;

import uce.flyweight.inter.IEmpleado;

public class Desarrolador implements IEmpleado {


    private final String trabajo;
    private String habilidad;


    public Desarrolador() {
        this.trabajo = "Desarrollador de software";


    }

    @Override
    public void habilidadAsignada(String habilidad) {
        this.habilidad = habilidad;

    }

    @Override
    public void tarea() {
        System.out.println("Desarrollador tiene esta habilidad: " + habilidad + " , con el trabajo " + trabajo);

    }
}
