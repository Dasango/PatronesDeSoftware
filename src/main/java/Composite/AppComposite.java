package com;

import com.impl.ProductoCompuesto;
import com.impl.ProductoPeso;
import com.impl.ProductoUnitario;
import com.model.Cliente;
import com.model.Pedido;

public class AppComposite {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(Cliente.PEPEELMAGO);
		
		ProductoUnitario cola = new ProductoUnitario("CocaCola","Refresco",3.25,2);
		ProductoUnitario atun = new ProductoUnitario("Atun Real","enlatado",1.25,2);
		ProductoUnitario fideo = new ProductoUnitario("Don Vitorio","pastas",1.85,2);
		ProductoUnitario chocolate = new ProductoUnitario("Choco","dulces",2.5,2);
		
		ProductoPeso jamon = new ProductoPeso("Jamon","embutidos",1.66,3.4);
		ProductoPeso papas = new ProductoPeso("Papas","embutidos",1.58,7.4);
		ProductoPeso arroz = new ProductoPeso("Arroz","embutidos",1.5,13.4);
		
		ProductoCompuesto canasta = new ProductoCompuesto();
		canasta.addProducto(arroz);
		canasta.addProducto(fideo);
		canasta.addProducto(jamon);
		
		pedido.addProducto(papas);
		pedido.addProducto(cola);
		pedido.addProducto(atun);
		pedido.addProducto(canasta);
		System.out.println("Total: " + pedido.getImporteTotal());
	}
}
