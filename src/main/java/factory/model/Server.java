package factory.model;


@factory.anotaciones.MiComponente(name = "Server")
public class Server extends Computadora {
	{
		System.out.println("se creó una instancia de server");
	}
}
