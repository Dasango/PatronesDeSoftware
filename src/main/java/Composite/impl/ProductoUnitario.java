package com.impl;

import com.inter.IPrecio;

public class ProductoUnitario implements IPrecio{

	private String nombre;
	private String categoria;
	private double precio;
	private int cantidad;
	
	public ProductoUnitario(String nombre, String categoria, double precio, int cantidad) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		return precio*cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
}
