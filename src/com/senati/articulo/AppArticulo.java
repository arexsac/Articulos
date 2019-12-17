package com.senati.articulo;

public class AppArticulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo Estudiante1 = new Articulo ("25771858","camisa","channel",50f);
		Articulo Estudiante2 = new Articulo ("25771859","pantalon","Pioner",125f);
		Articulo Estudiante3 = new Articulo ("25771850","polo","adidas",25f);
		System.out.println(Estudiante1.toString1());
		System.out.println(Estudiante2.toString1());
		System.out.println(Estudiante3.toString1());
		System.out.println(Estudiante1.toString2());
		System.out.println(Estudiante2.toString2());
		System.out.println(Estudiante3.toString2());
	}

}
