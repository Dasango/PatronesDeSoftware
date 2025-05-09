package Decorator.model;

import Decorator.imple.NotifcacionImple;
import Decorator.inter.Notificacion;

public  abstract class NotificacionDecorator implements Notificacion {

    protected Notificacion notificacion;

    public NotificacionDecorator(Notificacion noti) {
        this.notificacion= noti;
    }

    @Override
    public void enviar(String msg) {
        notificacion.enviar(msg);
    }
}
