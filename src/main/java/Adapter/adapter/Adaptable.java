package Adapter.adapter;

import Adapter.anotacion.Adaptador;
import Adapter.inter.Vehiculo;

import java.lang.reflect.Method;

public class Adaptable<T> implements Vehiculo {
    private final T instancia;
    private final Method method;

    public Adaptable(T instancia) {
        this.instancia = instancia;
        Class<?> clazz = instancia.getClass();
        Adaptador adaptador = clazz.getAnnotation(Adaptador.class);
        if (adaptador != null) {
            String metodo = adaptador.metodo();
            try {
                this.method = clazz.getMethod(metodo);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("El método especificado no existe en la clase " + clazz.getName(), e);
            }
        } else {
            throw new RuntimeException("La clase " + clazz.getName() + " no tiene la anotación Adaptador");
        }
    }

    @Override
    public void conducir() {
        try {
            method.invoke(instancia);
        } catch (Exception e) {
            throw new RuntimeException("Error al invocar el método " + method.getName() + " de la clase " + instancia.getClass().getName(), e);
        }
    }
}
