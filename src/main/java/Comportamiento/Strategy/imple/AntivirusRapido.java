package Strategy.imple;

public class AntivirusRapido extends AnalisisRapido{
    @Override
    public void iniciar() {
        System.out.println("inicio antivirus rapido");
    }

    @Override
    public void saltarComprimidos() {
        System.out.println("me salto todo");
    }

    @Override
    void detener() {
        System.out.println("DETENGO antivirus rapido");
    }



}
