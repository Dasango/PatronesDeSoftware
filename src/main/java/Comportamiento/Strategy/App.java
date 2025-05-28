package Strategy;

import Strategy.modelo.AnalizarVirus;
import Strategy.modelo.Tipo;

public class App {
    public static void main(String[] args) {
        AnalizarVirus  AvastAntivirus = new AnalizarVirus(Tipo.completo);
        AvastAntivirus.ejecutar();
    }
}
