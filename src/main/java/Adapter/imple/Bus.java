package Adapter.imple;

import Adapter.inter.Vehiculo;

public class Bus implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un bus");

    }
}
