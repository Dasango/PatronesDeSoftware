package Strategy.imple;

import Strategy.inter.IAnalisis;

public abstract class AnalisisCompleto implements IAnalisis {
    @Override
    public void analizar() {
        iniciar();
        analizarMemo();
        analizarKeyLoggers();
        analizarRootKits();
        descomprimir();
        detener();
    }

    public abstract void iniciar();
    public abstract void analizarMemo();
    public abstract void analizarKeyLoggers();
    public abstract void analizarRootKits();
    public abstract void descomprimir();
    public abstract void detener();
}
