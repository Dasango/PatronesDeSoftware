package Strategy.imple;

public class AntivirusCompleto extends AnalisisCompleto {

    private void metodoXD(String txt){
        System.out.println("Analizo el: "+ txt);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void iniciar() {
        System.out.println("INICIA un antivuros completo ");
    }

    @Override
    public void analizarMemo() {
        metodoXD("Memoria");
    }

    @Override
    public void analizarKeyLoggers() {
        metodoXD("keyloogers");

    }

    @Override
    public void analizarRootKits() {
        metodoXD("RootKits");

    }

    @Override
    public void descomprimir() {
        System.out.println("Idescomprimo");

    }

    @Override
    public void detener() {
        System.out.println("Detengo el antivirus COMPLETO");
    }
}
