package Decorator.model;

import Decorator.anotaciones.TipoNotificacion;
import Decorator.inter.Notificacion;

@TipoNotificacion("Push")
public class NotificacionPush extends  NotificacionDecorator{

    public NotificacionPush(Notificacion noti) {
        super(noti);
    }
    private  void  enviarPush(String msg){
        System.out.println("Enviando mensaje push " + msg);
    }
    @Override
    public void enviar(String msg){
        super.enviar(msg);
        enviarPush(msg);
    }
}
