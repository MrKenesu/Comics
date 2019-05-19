package test;

import tipos.Circulo;
import tipos.CirculoImpl;
import tipos.Punto;
import tipos.PuntoImpl;

public class TestCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto c = new PuntoImpl();
		Circulo cr = new CirculoImpl("(3.3,4.5);3.0");
	//	cr.setRadio(-3.3);
	//	cr.setCentro(null);
		System.out.println(cr);
	}

}
