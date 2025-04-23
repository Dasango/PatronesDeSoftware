package factory.pro;


import factory.model.Computadora;
import factory.abs.Factory;
import factory.abs.FactoryImpl;

public class AppFactory {
	public static void main(String[] args) {
		Factory fac = new FactoryImpl();
		Computadora pc = fac.create("pc");
		Computadora laptop = fac.create("laptop");
		Computadora server = fac.create("server");
	}
}
