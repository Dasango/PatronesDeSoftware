package com.model;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Tamagotchi tama = new Tamagotchi();

    public void display(){
        int op = 0;
        String msn = "Escoja una opcion: 1) jugar 2) alimentar 3) dormir 4) salir ";

        do{
            System.out.println(msn);
            op = sc.nextInt();
            switch(op){
                case 1:
                    tama.jugar();
                    break;
                case 2:
                    tama.alimentar();
                    break;
                case 3:
                    tama.dormir();
                    break;
                default: System.out.println("esa opcion no existe nmms");
            }
        }while(op!=4); //muestra hasta que le de a 4 (salir)

    }
}
