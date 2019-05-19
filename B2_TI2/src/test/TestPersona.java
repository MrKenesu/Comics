package test;

import java.time.LocalDate;

import tipos.Persona;
import tipos.PersonaImpl;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new PersonaImpl("Rafael", "Romero Aleta",LocalDate.of(1956,12,10));
		Persona p2 = new PersonaImpl("Rafael", "Romero Aleta");
		Persona p3 = new PersonaImpl("Rafael,Romero Aletaa,10,12,1956");
		informaOrden(p1,p2);
		informaOrden(p2,p3);
		informaOrden(p1,p3);
		informaEqualsHashCodeOrden(p1, p2);
		informaEqualsHashCodeOrden(p1, p3);
		informaEqualsHashCodeOrden(p3, p1);

	}

	public static void informaEqualsHashCodeOrden(Persona p1, Persona p2) {

		System.out.println("Parametro 1 : " + p1);
		System.out.println("Parametro 2 : " + p2);
		System.out.println(" Igual : "+ p1.equals(p2) + " Codigo P1: " + p1.hashCode()
		+ " Codigo P2: " + p2.hashCode() + " Orden :" + p1.compareTo(p2));

	}

	public static void informaOrden(Persona p1, Persona p2) {

		if (p1.compareTo(p2) == 0) {
			System.out.println(p1 + " y " + p2 + " son iguales");
		} else {
			if (p1.compareTo(p2) < 0) {
				System.out.println(p1 + " está antes en el orden que " + p2);
			} else {
				System.out.println(p1 + " está después en el orden que " + p2);
			}
		}
	}
}
