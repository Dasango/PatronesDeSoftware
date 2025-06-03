package com;

import com.inter.State;
import com.model.Menu;

public class AppState {

    public static void main(String[] args) {

        State.stateChange.subscribe(System.out::println); //suscribiendo el observable que accion va a ejecutar

        Menu menu = new Menu();
        menu.display();

    }

}
