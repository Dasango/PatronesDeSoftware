package bridge.factory;

import java.util.HashMap;
import java.util.Map;


import bridge.inter.Figura;
import bridge.inter.IColor;
import com.google.common.reflect.ClassPath;

public class FiguraFactory {

    private Map<String, Class> figuras = new HashMap<String,Class>();
    private Map<String, Class> colores = new HashMap<String,Class>();


    {
        try {
            ClassPath classPath = ClassPath.from(FiguraFactory.class.getClassLoader());
            var clases = classPath.getTopLevelClassesRecursive("bridge.imple");
            for(var it: clases) {
                var miComp = it.load().getAnnotation(bridge.anotaciones.figura.class);
                if(miComp != null) {
                    figuras.put(miComp.name(), it.load());
                    System.err.println(miComp.name());
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        try {
            ClassPath classPath = ClassPath.from(FiguraFactory.class.getClassLoader());
            var clases = classPath.getTopLevelClassesRecursive("bridge.imple");
            for(var it: clases) {
                var miComp = it.load().getAnnotation(bridge.anotaciones.color.class);
                if(miComp != null) {
                    colores.put(miComp.name(), it.load());
                    System.err.println(miComp.name());
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public Figura crearFigura(String figura, String color) {
        try {
            Class<? extends Figura> figuraClass = figuras.get(figura);
            Class<? extends IColor> colorClass = colores.get(color);

            if (figuraClass != null && colorClass != null) {
                IColor nuevoColor = colorClass.getDeclaredConstructor().newInstance();
                Figura nuevaFigura = figuraClass.getDeclaredConstructor(IColor.class).newInstance(nuevoColor);

                return nuevaFigura;
            } else {
                System.err.println("Figura o color no encontrado.");
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

