package Adapter;

import Adapter.adapter.Adaptable;
import Adapter.anotacion.Adaptador;
import Adapter.imple.Auto;
import Adapter.imple.Bus;
import Adapter.imple.Grua;
import Adapter.inter.Vehiculo;

import java.util.List;

public class AppAdapter {
    public static void main(String[] args) {
        Auto auto = new Auto();

        Adaptable<Auto> adaptableAuto = new Adaptable<>(auto);

        adaptableAuto.conducir();

        Grua grua = new Grua();
        Adaptable<Grua> adaptableGrua = new Adaptable<>(grua);
        adaptableGrua.conducir();

        Bus bus = new Bus();

        bus.conducir();


        List<Object> vehiculos = List.of(auto, grua, bus);

        vehiculos.stream()
                .filter(obj -> obj.getClass().isAnnotationPresent(Adaptador.class))
                .map(obj ->{
                    try {
                        return new Adaptable (obj);
                    } catch (Exception e) {
                        throw new RuntimeException("Error al crear el adaptable", e);
                    }
                })
                .forEach(Vehiculo::conducir);
    }
}
