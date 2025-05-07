package Decorator.base;

import Decorator.inter.Notificacion;

public class NotificacionBase implements Notificacion {
    @Override
    public void enviar(String msg) {
        System.out.println("Enviando mensaje por obj base");
    }
}
