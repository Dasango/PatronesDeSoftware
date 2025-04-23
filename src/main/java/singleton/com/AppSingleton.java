package singleton.com;

public class AppSingleton {

    public static void main(String... args) {
        Connection db= new Connection();
        Singleton sin1= Singleton.getInstance(db);
        System.out.println("Segunda instancia");
        Singleton sin2= Singleton.getInstance(db);
    }

}
