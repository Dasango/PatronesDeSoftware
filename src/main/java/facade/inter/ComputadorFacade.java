package facade.inter;

import facade.imple.ComputadorMemoria;
import facade.imple.ComputadorProcesador;
import facade.imple.ComputadoraMainboard;

public class ComputadorFacade {
     private ComputadoraMainboard computadoraMainboard;
     private ComputadorMemoria computadorMemoria;
     private ComputadorProcesador computadorProcesador;

    {
        this.computadorProcesador= new ComputadorProcesador();
        this.computadorMemoria= new ComputadorMemoria();
    }

     public void construirComputador(String disco, String memoria, String procesador){
         this.computadorProcesador.crearProcesador(procesador);
         System.out.println("Ensamblo el procesador");
         this.computadorMemoria.crearMemoria(disco, memoria);
         System.out.println("Ensamblo la memoria");
         System.out.println("----Ensamblaje terminado----");
     }
}
