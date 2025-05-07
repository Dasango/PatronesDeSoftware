package Decorator.model;

import Decorator.base.NotificacionBase;
import Decorator.inter.Notificacion;
import com.google.common.reflect.ClassPath;
import Decorator.anotaciones.TipoNotificacion;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificacionFactory {

    private static final Map<String, Class<? extends NotificacionDecorator>> decoradores = new HashMap<>();

    static {
        inicializar("Decorator.model"); // Ajusta al paquete donde están tus clases decoradoras
    }

    private static void inicializar(String paquete) {
        try {
            ClassPath cp = ClassPath.from(NotificacionFactory.class.getClassLoader());
            for (ClassPath.ClassInfo classInfo : cp.getTopLevelClassesRecursive(paquete)) {
                Class<?> clazz = classInfo.load();
                if (NotificacionDecorator.class.isAssignableFrom(clazz)) {
                    TipoNotificacion anotacion = clazz.getAnnotation(TipoNotificacion.class);
                    if (anotacion != null) {
                        decoradores.put(anotacion.value(), (Class<? extends NotificacionDecorator>) clazz);
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Error inicializando la fábrica de notificaciones", e);
        }
    }

    public static Notificacion crearNotificacion(List<String> tipos) {
        Notificacion notificacion = new NotificacionBase();

        for (String tipo : tipos) {
            Class<? extends NotificacionDecorator> claseDecoradora = decoradores.get(tipo);
            if (claseDecoradora == null) {
                System.out.println("Tipo de notificación no reconocido: " + tipo);
                continue;
            }
            try {
                Constructor<? extends NotificacionDecorator> ctor = claseDecoradora.getConstructor(Notificacion.class);
                notificacion = ctor.newInstance(notificacion);
            } catch (Exception e) {
                throw new RuntimeException("Error creando decorador para tipo: " + tipo, e);
            }
        }

        return notificacion;
    }
}
