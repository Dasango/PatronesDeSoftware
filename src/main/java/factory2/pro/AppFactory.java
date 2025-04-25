package factory2.pro;

import factory2.inter.Factory;
import factory2.inter.FactoryImpl;
import factory2.model.Computadora;

import java.util.HashMap;
import java.util.Map;


public class AppFactory {
	public static void main(String[] args) {
		Map<String, Class> componentes = new HashMap<String, Class>();
		Factory fac = new FactoryImpl();
		fac.init("factory2.model");
		
		Computadora pc = fac.create("pc");
		Computadora laptop = fac.create("laptop");
		Computadora server = fac.create("server");

		System.out.println("aaa");
		System.out.println(pc.toString());
	}
}
