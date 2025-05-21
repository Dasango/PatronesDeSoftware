package com.impl;

import com.inter.IPrecio;

public class ProductoPeso implements IPrecio{

	private String nombre;
	private String categoria;
	private double precioPeso;
	private double peso;
	
	public ProductoPeso(String nombre, String categoria, double precioPeso, double peso) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precioPeso = precioPeso;
		this.peso = peso;
	}
	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		return precioPeso*peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
