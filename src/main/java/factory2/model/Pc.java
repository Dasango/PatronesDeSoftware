package factory2.model;


@factory2.anotaciones.MiComponente(name = "pc")

public class Pc extends Computadora{

	{
		System.out.println("se creó una instancia de pc");
	}
}
