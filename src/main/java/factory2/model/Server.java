package factory2.model;


@factory2.anotaciones.MiComponente(name = "server")

public class Server extends Computadora {
	{
		System.out.println("se creó una instancia de server");
	}
}
