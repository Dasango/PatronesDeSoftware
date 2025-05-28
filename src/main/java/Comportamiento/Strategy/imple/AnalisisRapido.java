package Strategy.imple;

import Strategy.inter.IAnalisis;

public abstract class AnalisisRapido implements IAnalisis {

    @Override
    public void analizar() {
        iniciar();
        saltarComprimidos();
        detener();
    }
    public abstract void iniciar();
    public abstract void saltarComprimidos();
    abstract void  detener();
}
