package bridge;

import bridge.factory.FiguraFactory;
import bridge.inter.Figura;

public class bridgeApp {
    public static void main(String[] args) {

        FiguraFactory factory = new FiguraFactory();

        Figura figura = factory.crearFigura("triangulo", "verde");

        if (figura != null) {
            figura.dibujarFigura(2);
        }
    }
}
