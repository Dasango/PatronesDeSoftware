package factory.model;


@factory.anotaciones.MiComponente(name = "Pc")
public class Pc extends Computadora{

	{
		System.out.println("se creó una instancia de pc");
	}
}
