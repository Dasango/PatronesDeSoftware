package factory2.inter;

import java.util.HashMap;
import java.util.Map;


import com.google.common.reflect.ClassPath;

public class FactoryImpl implements Factory{
	
	private Map<String, Class> componentes = new HashMap<String,Class>();
	
	@Override
	public void init(String pkgName) {
		// TODO Auto-generated method stub
		System.out.println("inicia");
		try {
			ClassPath classPath = ClassPath.from(FactoryImpl.class.getClassLoader());
			var clases = classPath.getTopLevelClassesRecursive(pkgName);
			for(var it: clases) {
				var miComp = it.load().getAnnotation(factory2.anotaciones.MiComponente.class);
				if(miComp != null) {
					componentes.put(miComp.name(), it.load());
					System.err.println(miComp.name());
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public <T> T create(String name) {
		// TODO Auto-generated method stub
		Object obj = null;
		var value = componentes.get(name);
		if(value==null) {
			throw new RuntimeException("Componente " + name +" no encontrado :o" );
		}
		try {
			var cto = value.getConstructor();
			obj = cto.newInstance();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return (T)obj;
	}

}
