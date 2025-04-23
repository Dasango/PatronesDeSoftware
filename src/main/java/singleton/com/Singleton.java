package singleton.com;


import singleton.anotaciones.MiComponente;

@MiComponente(name = "servicioProdutos")
public class Singleton {
    private static Singleton instancia = null;
    private static Connection dbCon = null;

    private Singleton() {

        try {
            var con = dbCon.getConnection();
            System.out.println("bien");

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public static Singleton getInstance(Connection c) {
        dbCon = c;
        if(instancia == null) {
            instancia = new Singleton();}
        else{
            System.out.println();
        }
        return instancia;
    }
}