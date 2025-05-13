package facade.imple;

public class ComputadorMemoria {


    String disco= "aa";
    String ram= "aa";

    public void crearMemoria(String disco, String ram){
        this.disco= disco;
        this.ram= ram;
        System.out.println("Agrengando la memoria con memoria solida: "+ disco+ "\ny memoria ram: " +ram);

    }

}
