package Decorator;

import Decorator.inter.Notificacion;
import Decorator.model.NotificacionFactory;

import java.util.Arrays;
import java.util.List;

public class AppDecorator {
    public static void main(String[] args) {
        // Lista de tipos de notificaciones (basados en los valores definidos en @TipoNotificacion)
        List<String> tipos = Arrays.asList("SMS", "Push", "SMS", "SMS");

        // Crear la notificación compuesta usando la factory basada en anotaciones
        Notificacion notificacion = NotificacionFactory.crearNotificacion(tipos);

        // Enviar mensaje
        notificacion.enviar("HOLAA");
    }
}
