package com.model;

import com.impl.ProductoCompuesto;
import com.impl.ProductoPeso;
import com.impl.ProductoUnitario;
import com.inter.IPrecio;

public class Pedido extends ProductoCompuesto{

	private Cliente cliente;
	
	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addProducto(IPrecio producto) {
		super.addProducto(producto);
	}
	
	public void removeProducto(IPrecio prod) {
		super.removeProducto(prod);
	}
	
	public void establecerCantidad(IPrecio prod, int cantidad) {
		if(prod instanceof ProductoUnitario) {
			ProductoUnitario p = (ProductoUnitario) prod;
					p.setCantidad(cantidad);
		}
	}
	
	public void establecerPeso(IPrecio prod, double peso) {
		if(prod instanceof ProductoPeso) {
			ProductoPeso p = (ProductoPeso) prod;
			p.setPeso(peso);
		}
	}
	
	
}
