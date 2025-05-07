package Adapter.imple;

import Adapter.anotacion.Adaptador;

@Adaptador(metodo = "manejarAuto")
public class Auto {

    public void manejarAuto() {
        System.out.println("Conduciendo un auto");
    }
}
