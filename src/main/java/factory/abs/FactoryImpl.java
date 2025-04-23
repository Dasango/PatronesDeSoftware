package factory.abs;


import factory.model.*;

public class FactoryImpl implements Factory{

	@Override
	public <T> T create(String name) {
		Object ret = null;
		switch(name) {
		case "pc":
		 ret = new Pc();
		 break;
		case "laptop":
			ret = new Laptop();
			 break;
		case "server":
			ret = new Server();
			 break;
			 
		default: System.out.println("no existe");
		}
		return (T)ret;
	}

}
