package bridge.imple;

import bridge.anotaciones.figura;
import bridge.inter.Figura;
import bridge.inter.IColor;

@figura(name = "triangulo")
public class Triangulo extends Figura {

    public Triangulo(IColor color) {
        super(color);
    }

    @Override
    public void dibujarFigura(int borde) {
        System.out.println("El Triangulo se dibuja con color, ");
        color.pintar(borde);
    }

    @Override
    public void modificarBorde(int borde, int incremento) {
        System.out.println("El borde se incrementará");
        borde *= incremento;
        dibujarFigura(borde);
    }
}
