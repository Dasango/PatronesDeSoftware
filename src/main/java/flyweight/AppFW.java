package uce.flyweight;

import uce.flyweight.impl.EmpleadoFactory;
import uce.flyweight.inter.IEmpleado;

import java.util.Random;

public class AppFW {
    private static String[] empleadoTipo = {"Desarrollador", "Tester",};
    private static String[] habilidadesTipo = {"Java", "Python", "C++", ".Net", "MalumaKotlin"};
    private static Random random = new Random();

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            IEmpleado e = EmpleadoFactory.getIEmpleado(getRandomTipo());
            e.habilidadAsignada(getRandomHabilidad());
            e.tarea();


        }
    }

    public static String getRandomHabilidad() {
        int opcion = random.nextInt(habilidadesTipo.length);
        return habilidadesTipo[opcion];


    }

    public static String getRandomTipo() {

        int opcion = random.nextInt(empleadoTipo.length);
        return empleadoTipo[opcion];
    }

}
