package test;

import tipos.Punto;
import tipos.PuntoImpl1;

public class TestPuntoImpl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new PuntoImpl1(1.0,2.0);
		Punto p2 = new PuntoImpl1(1.0,2.0);
		Punto p3 = p1;
		System.out.println("El punto p1 es : "+ p1);
		System.out.println("El punto p2 es : "+ p2);
		System.out.println("El punto p3 es : "+ p3);
		System.out.println("El codigo Hash del punto p1 es : "+ p1.hashCode());
		System.out.println("El codigo Hash del punto p2 es : "+ p2.hashCode());
		System.out.println("El codigo Hash del punto p3 es : "+ p2.hashCode());
		System.out.println("El punto p1 es igual a p2 es : " + p1.equals(p2));
		System.out.println("El punto p1 es igual a p3 es : " + p1.equals(p3));
		System.out.println("El punto p1 es identico a p2 es : " + (p1==p2));
		System.out.println("El punto p1 es identico a p3 es : " + (p1==p3));

	}

}
