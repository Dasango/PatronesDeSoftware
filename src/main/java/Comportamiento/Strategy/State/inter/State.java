package com.inter;

import com.model.Tamagotchi;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

public sealed interface State permits HappyState, HungryState, SleptState {

    static BehaviorSubject<String> stateChange = BehaviorSubject.create(); //observadores, de la dependencia
    void jugar(Tamagotchi tama);
    void alimentar(Tamagotchi tama);
    void dormir(Tamagotchi tama);

}
