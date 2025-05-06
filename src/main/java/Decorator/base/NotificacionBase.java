package com.base;

import com.inter.Notificacion;

public class NotificacionBase implements Notificacion {
    @Override
    public void enviar(String msg) {
        System.out.println("Enviando mensaje por obj base");
    }
}
