package uce.proxy.impl;

import uce.proxy.inter.OperacionesCadenas;

public class OperacionesCadenasReal implements OperacionesCadenas {


    @Override
    public String may(String s) {
        try{
            Thread.sleep(1000);

        }catch (Exception e){}
        return s.toUpperCase();
    }




}
