package com.senati.articulo;

public class Articulo {
//-------------Declaracion de los atributos-----------//
		String codigo;
		String descripcion;
		String marca;
		float precio;
	
//-------------Declaracion de los constructores-----------//
		public Articulo(String codigo, String descripcion, String marca, float precio) {
			super();
			this.codigo = codigo;
			this.descripcion = descripcion;
			this.marca = marca;
			this.precio = precio;
		}
			
//-------------Declaracion de los Getters y Setters-----------//
		public Articulo() {
			super();	
			}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public float getPrecio() {
			return precio;
		}
		public void setPrecio(float precio) {
			this.precio = precio;
		}
//-------------Metodo toString-----------//

	//	@Override
		public String toString1() {
			return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", marca=" + marca + ", precio="
					+ precio + "]";
		}
		public String toString2() {
			return "Articulo [descripcion=" + descripcion + ", marca=" + marca +"]";
		}
}


