package uce.proxy.dinamic;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ImpresionInvocationHandle implements InvocationHandler {
    private Object target;
   public ImpresionInvocationHandle(Object target){
       this.target = target;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object... args) throws Throwable {
        System.out.printf("----Invocando a %s ( %s ): ", method.getName(), Arrays.toString(args)); //Para saber nomás.
        long inicio = System.nanoTime(); //Control de tiempo
        Object res = method.invoke(target, args);
        long fin = System.nanoTime() - inicio;
        System.out.printf("Tiempo: %.3f ms\n ", fin / 1000.0f);
        return res;
    }
}
