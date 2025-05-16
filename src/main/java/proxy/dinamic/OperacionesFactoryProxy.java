package uce.proxy.dinamic;

import uce.proxy.impl.OperacionesCadenasReal;
import uce.proxy.impl.OperacionesNumerosReal;
import uce.proxy.inter.OperacionesNumeros;

import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public final class OperacionesFactoryProxy {

    //Clase interfaz
    private static Map<Class<?>, Class<?>> servicio= new HashMap<>();

    public static void registrar(Class <?> in, Class <?> impl ){
        servicio.put(in,impl);

    }

    // Sirve para cualquier interfaz.
    // Crea instancias factory.
    // target es el bojeto real.
    private static Object crearProxy(Object target) {
        Object proxy = Proxy.newProxyInstance(
                OperacionesFactoryProxy.class.getClassLoader(),
                target.getClass().getInterfaces(),
                new ImpresionInvocationHandle(target)
        );

        return proxy;//La clase proxy viene de lenguaje.


    }

    public  static <T> T crear(Class <T> in){
        Class <?> imple = servicio.get(in);
        Constructor<?> ctor = imple.getDeclaredConstructors()[0];
        Object target = null;
        try {
            target = ctor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Object proxy= crearProxy(target);
        return in.cast(proxy);
    }
/*
    // Aquí puedo usar object o genéricos
    public static <T> T crearNumero(Class<T> clas){
        OperacionesNumeros target = new OperacionesNumerosReal();
        Object proxy  = crearProxy(target);
        return clas.cast(proxy);
}
/*
    //  Por terminar
    public static <T> T crearCadena(Class<T> clas){
        OperacionesCadenasReal target = new OperacionesCadenasReal();
        Object proxy  = crearProxy(target);
        return clas.cast(proxy);





    }*/}
