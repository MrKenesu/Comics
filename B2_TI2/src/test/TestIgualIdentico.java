package test;

import tipos.Punto;
import tipos.PuntoImpl;

public class TestIgualIdentico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 7;
		int j = 4;
		System.out.println("Si i = " + i + " y j = " +j + " Entonces i == j es " + (i==j) );
		j = 7;
		System.out.println("Si i = " + i + " y j = " +j + " Entonces i == j es " + (i==j) );
//		boolean b = i.equals(j);
		Punto p1 = new PuntoImpl(1.0, 2.0);
		Punto p2 = new PuntoImpl(1.0, 2.0);
		System.out.println("Puntos iguales");
		System.out.println("Si p1 = " + p1 + " y p2 = " +p2 + " Entonces p1 == p2 es " + (p1==p2) );
		System.out.println("Si p1 = " + p1 + " y p2 = " +p2 + " Entonces p1 == p2 es " + p1.equals(p2));
		Punto p3 = p1;
		System.out.println("Puntos identicos");
		System.out.println("Si p1 = " + p1 + " y p3 = " +p3 + " Entonces p1 == p2 es " + (p1==p3) );
		System.out.println("Si p1 = " + p1 + " y p3 = " +p3 + " Entonces p1 == p2 es " + p1.equals(p3));
		
		Integer a = 3;
		Integer b = a;
		System.out.println("Si son Integer a = " + a + " y b = " +b + " Entonces a == b es " +(a == b));
		System.out.println("Si son Integer a = " + a + " y b = " +b + " Entonces a.equals(b) es " +a.equals(b));
		b++;	
		System.out.println("Si son Integer a = " + a + " y b = " +b + " Entonces a == b es " +(a == b));
		System.out.println("Si son Integer a = " + a + " y b = " +b + " Entonces a.equals(b) es " +a.equals(b));

	}

}
