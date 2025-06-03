package com.inter;

import com.model.Tamagotchi;

public final class HappyState implements State{
    @java.lang.Override
    public void jugar(Tamagotchi tama) {
        State.stateChange.onNext("SIUUUUUUU......*juega"); //onNext lanza mensaje
        tama.setState(new SleptState()); //cambio de estado
    }

    @java.lang.Override
    public void alimentar(Tamagotchi tama) {
        State.stateChange.onNext("La comida esta sobrevalorada");
    }

    @java.lang.Override
    public void dormir(Tamagotchi tama) {
        State.stateChange.onNext("Dormir es para los debiles");
    }
}
