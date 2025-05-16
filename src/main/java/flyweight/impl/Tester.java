package uce.flyweight.impl;

import uce.flyweight.inter.IEmpleado;

public class Tester implements IEmpleado {

    private final String trabajo;
    private String habilidad;
    public Tester(){
        this.trabajo = "Probar los programas";


    }
    @Override
    public void habilidadAsignada(String habilidad) {
        this.habilidad = habilidad;

    }

    @Override
    public void tarea() {
        System.out.println("Tester con habilidad asignada: " + habilidad);

    }
}
