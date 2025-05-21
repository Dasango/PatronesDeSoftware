package com.refl;

import java.lang.reflect.Field;
import java.util.List;

import com.impl.ProductoCompuesto;
import com.impl.ProductoPeso;
import com.impl.ProductoUnitario;
import com.inter.IPrecio;
import com.model.Pedido;

public class InspectorPrecio {

	public static void imprimirDetalles(IPrecio prod) {
		Class<?> clase = prod.getClass();
		System.out.println("Clase: " + clase.getSimpleName()); // Para ir viendo que hago xd

		Field[] fields = clase.getDeclaredFields(); // para atributos, antes era con getDeclaredConstructors
		// este getDeclared devuelve atributos sean publicos o privados
		for (var it : fields) {
			it.setAccessible(true);// sin este no puedo acceder a lo privado

			try {
				Object valor = it.get(prod);
				System.out.println(" " + it.getName() + " = " + valor);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				System.out.println("No se puede acceder a: " + it.getName());
			}
		}

		if (prod instanceof ProductoCompuesto) {
			List<IPrecio> subProd = ((ProductoCompuesto) prod).getProductos();
			for (IPrecio it : subProd) {
				imprimirDetalles(it);
			}
		}
	}
	
	public void cambiarPrecio(Pedido ped, String nombre, double newPrecio) {
		
		for(IPrecio it: ped.getProductos()) {
			
		}
	}
	
	public void cambiarPrecioRecursivo(IPrecio prod, String nombre, double newPrecio) {
		Class<?> clase = prod.getClass();
		
		try {
			Field nameField = clase.getDeclaredField("nombre"); //veo si existe el atributo
			nameField.setAccessible(true); //sin este no puedo acceder a lo privado
			Object nombreValor = nameField.get(prod);
			
			if(nombreValor  != null && nombreValor.equals(nombre)) {
				Field prodField = null;
				
				if(prod instanceof ProductoUnitario) {
					prodField = clase.getDeclaredField("precio");
					
				}else if (prod instanceof ProductoPeso) {
					prodField = clase.getDeclaredField("precioPeso");
				}
				if(prodField != null) {
					prodField.setAccessible(true);
					prodField.set(prod, newPrecio);
					System.out.println("Precio cambiado para: "+nombre+", el nuevo precio es: "+newPrecio);
				}
				
			}
			
		}catch(Exception e) {
			
		}
	}

}
