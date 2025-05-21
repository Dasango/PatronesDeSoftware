package bridge.imple;

import bridge.inter.Figura;
import bridge.inter.IColor;
import bridge.anotaciones.figura;

@figura(name = "cuadrado")
public class Cuadrado extends Figura {

    public Cuadrado(IColor color) {
        super(color);
    }

    @Override
    public void dibujarFigura(int borde) {
        System.out.println("El Cuadrado se dibuja con color, ");
        color.pintar(borde);
    }

    @Override
    public void modificarBorde(int borde, int incremento) {
        System.out.println("El borde se incrementará");
        borde *= incremento;
        dibujarFigura(borde);
    }
}
