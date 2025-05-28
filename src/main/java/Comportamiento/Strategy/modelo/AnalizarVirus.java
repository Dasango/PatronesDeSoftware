package Strategy.modelo;

import Strategy.imple.AntivirusCompleto;
import Strategy.imple.AntivirusRapido;
import Strategy.inter.IAnalisis;

public class AnalizarVirus {

    private IAnalisis analisis;

    public AnalizarVirus(Tipo tipo) {
        factory(tipo.name());
    }

    private void factory(String a){
        switch (a){
            case "completo":
                analisis =new AntivirusCompleto();
                break;
            case "rapido":
                analisis =new AntivirusRapido();
                break;
            default:
                System.err.println("se frego el factory en analizar virus");
                throw new RuntimeException();
        }
    }
    public void ejecutar(){
        this.analisis.analizar();
    }

}
