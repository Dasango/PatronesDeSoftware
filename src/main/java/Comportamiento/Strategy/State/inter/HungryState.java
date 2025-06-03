package com.inter;

import com.model.Tamagotchi;

public final class HungryState implements State{
    @java.lang.Override
    public void jugar(Tamagotchi tama) {
        State.stateChange.onNext("No quiere jugar, tiene mucha hambre"); //onNext lanza mensaje
    }

    @java.lang.Override
    public void alimentar(Tamagotchi tama) {
        State.stateChange.onNext("*Come ");
        tama.setState(new HappyState()); //cambio de estado
    }

    @java.lang.Override
    public void dormir(Tamagotchi tama) {
        State.stateChange.onNext("¿Cómo que dormir?, hay que laburar, no pidan mas plata regalada");
    }
}
