package com.inter;

import com.model.Tamagotchi;

public final class SleptState implements State{
    @java.lang.Override
    public void jugar(Tamagotchi tama) {
        State.stateChange.onNext("No quiere jugar, esta cansado"); //onNext lanza mensaje
    }

    @java.lang.Override
    public void alimentar(Tamagotchi tama) {
        State.stateChange.onNext("Comer a esta hora da cancer");
    }

    @java.lang.Override
    public void dormir(Tamagotchi tama) {
        State.stateChange.onNext("Vladimir.......*se duerme");
        tama.setState(new HungryState()); //cambio de estado
    }
}
