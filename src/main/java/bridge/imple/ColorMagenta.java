package bridge.imple;

import bridge.inter.IColor;
import bridge.anotaciones.color;

@color(name = "magenta")
public class ColorMagenta implements IColor {

    @Override
    public void pintar(int borde) {
        System.out.println("Color magenta, "+ borde +" cm de borde");
    }
}
