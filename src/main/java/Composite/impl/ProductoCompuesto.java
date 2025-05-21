package com.impl;

import java.util.ArrayList;

import com.inter.IPrecio;

public class ProductoCompuesto implements IPrecio{

	private ArrayList<IPrecio> productos;
	
	public ProductoCompuesto() {
		productos = new ArrayList<IPrecio>();
	}


	public void addProducto(IPrecio prod) {
		productos.add(prod);
	}
	
	public void removeProducto(IPrecio prod) {
		productos.remove(prod);
	}

	@Override
	public double getImporteTotal() {
		double tot =0.0;
		for(var it : productos) {
			tot += it.getImporteTotal();
			
		}
		// TODO Auto-generated method stub
		return tot;
	}


	public ArrayList<IPrecio> getProductos() {
		return productos;
	}
	
	

}
