package com.model;

import com.inter.Notificacion;

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
