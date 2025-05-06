package com;

import com.inter.Notificacion;
import com.model.NotificacionFactory;

import java.util.Arrays;
import java.util.List;

public class AppDecorator {
    public static void main(String[] args) {

        List<String> tipos = Arrays.asList("SMS", "Push","SMS","SMS");

        Notificacion notificacion = NotificacionFactory.crearNotificacion(tipos);

        notificacion.enviar("Mensaje con Push y SMS");
    }
}
