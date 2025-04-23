package factory.model;


@factory.anotaciones.MiComponente(name = "Laptop")
public class Laptop extends Computadora{
	{
		System.out.println("se creó una instancia de laptop");
	}
}
