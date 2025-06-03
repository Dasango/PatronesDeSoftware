package com.model;

import com.inter.HappyState;
import com.inter.HungryState;
import com.inter.State;

public class Tamagotchi { //NO implementa la interface
    private State context;

   public Tamagotchi(){
       this.context = new HappyState();
   }

   public void setState(State state){
       this.context = state;
   }
   public void jugar(){
       context.jugar(this); //this el objeto actual
   }
   public void alimentar(){
       context.alimentar(this);
   }
   public void dormir(){
       context.dormir(this);
   }
}
