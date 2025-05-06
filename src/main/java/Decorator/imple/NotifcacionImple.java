package com.imple;

import com.inter.Notificacion;

public class NotifcacionImple implements Notificacion {
    @Override
    public void enviar(String msg) {
        System.out.println("eviar mensago "+ msg);
    }
}
