package com.model;

import com.inter.Notificacion;

public class NotificacionSMS  extends  NotificacionDecorator{

    public NotificacionSMS (Notificacion noti) {
        super(noti);
    }
    private  void  enviarPush(String msg){
        System.out.println("Enviando mensaje sms " + msg);
    }
    @Override
    public void enviar(String msg){
        super.enviar(msg);
        enviarPush(msg);
    }
}
