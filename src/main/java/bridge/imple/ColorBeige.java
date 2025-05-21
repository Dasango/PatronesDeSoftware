package bridge.imple;

import bridge.inter.IColor;
import bridge.anotaciones.color;

@color(name = "beige")
public class ColorBeige implements IColor {

    @Override
    public void pintar(int borde) {
        System.out.println("Color beige, "+ borde +" cm de borde");
    }
}
