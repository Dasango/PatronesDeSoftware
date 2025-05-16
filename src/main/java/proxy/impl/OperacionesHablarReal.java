package uce.proxy.impl;

import uce.proxy.inter.OperacionesHablar;

public class OperacionesHablarReal implements OperacionesHablar {
    @Override
    public String saludo() {
        return "hola";
    }

    @Override
    public String despedida() {
        return "chao";
    }
}
