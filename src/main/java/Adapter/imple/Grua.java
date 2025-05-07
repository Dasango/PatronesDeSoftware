package Adapter.imple;

import Adapter.anotacion.Adaptador;

@Adaptador(metodo = "operarGrua")
public class Grua {
    public void operarGrua() {
        System.out.println("Conduciendo una grúa");
    }
}
