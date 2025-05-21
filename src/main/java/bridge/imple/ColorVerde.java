package bridge.imple;

import bridge.inter.IColor;

import bridge.anotaciones.color;

@color(name = "verde")
public class ColorVerde implements IColor {

    @Override
    public void pintar(int borde) {
        System.out.println("Color verde, "+ borde +" cm de borde");
    }
}
