package factory2.model;


@factory2.anotaciones.MiComponente(name = "laptop")

public class Laptop extends Computadora{
	{
		System.out.println("se creó una instancia de laptop");
	}
}
