package bridge.imple;

import bridge.anotaciones.figura;
import bridge.inter.Figura;
import bridge.inter.IColor;

@figura(name = "rectangulo")
public class Rectangulo extends Figura {

    public Rectangulo(IColor color) {
        super(color);
    }

    @Override
    public void dibujarFigura(int borde) {
        System.out.println("El Rectangulo se dibuja con color, ");
        color.pintar(borde);
    }

    @Override
    public void modificarBorde(int borde, int incremento) {
        System.out.println("El borde se incrementará");
        borde *= incremento;
        dibujarFigura(borde);
    }
}
