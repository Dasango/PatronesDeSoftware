package bridge.inter;

public abstract class Figura {
    protected IColor color;

    public Figura(IColor color) {
        this.color = color;
    }

    public abstract void dibujarFigura(int borde);
    public abstract void modificarBorde(int borde,int incremento);
}
