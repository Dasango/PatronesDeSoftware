package com.model;

import com.inter.Notificacion;
import  com.base.NotificacionBase;

import java.util.List;

public class NotificacionFactory {

    public static Notificacion crearNotificacion(List<String> tipos) {
        Notificacion notificacion = new NotificacionBase();

        for (String tipo : tipos) {
            switch (tipo) {
                case "SMS":
                    notificacion = new NotificacionSMS(notificacion);
                    break;
                case "Push":
                    notificacion = new NotificacionPush(notificacion);
                    break;
                default:
                    System.out.println("Tipo de notificación no reconocido: " + tipo);
                    break;
            }
        }

        return notificacion;
    }
}
