package test;

import tipos.Circulo;
import tipos.CirculoImpl;
import tipos.Punto;
import tipos.PuntoImpl;

public class TestCirculo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor(new PuntoImpl(1.0, 1.0), 1.0);
		TestConstructor(new PuntoImpl(1.0, 1.0), 0.0);
		TestConstructor(new PuntoImpl(1.0, 1.0), -1.0);
		TestConstructor(null, 1.0);
		TestConstructor(new PuntoImpl(1.0, 1.0), null);

		Punto p = new PuntoImpl(1.0, 1.0);
		Double r = 1.0;
		Circulo c = new CirculoImpl(p, r);
		MostrarCirculo(c);
		TestSetRadio(c, 2.0);
		TestSetRadio(c, 0.0);
		TestSetRadio(c, -1.0);
		TestSetRadio(c, null);

	}
	private static void TestConstructor(Punto p, Double r){
		  try{
			Circulo c = new CirculoImpl(p,r);
			MostrarCirculo(c);
		  } catch (IllegalArgumentException e) {
		      System.out.println("**Se ha capturado la excepción IllegalArgumentException"+ e.getMessage());
		  } catch (NullPointerException e) {
		      System.out.println("** Se ha capturado la excepcion NullPointerException"+ e.getMessage());
		  }catch (Exception e) {
		      System.out.println("**Se ha capturado una EXCEPCIÓN INESPERADA!!!"+ e.getMessage());
		  }
		}

	private static void TestSetRadio(Circulo c, Double r) {
		try {
			c.setRadio(r);
			;
			MostrarCirculo(c);
		} catch (IllegalArgumentException e) {
			System.out.println("** Se ha capturado la excepción IllegalArgumentException" + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("**Se ha capturado la excepcion NullPointerException" + e.getMessage());
		} catch (Exception e) {
			System.out.println("**Se ha capturado una EXCEPCIÓN INESPERADA!!!" + e.getMessage());
		}
	}

	private static void MostrarCirculo(Circulo c) {

		System.out.println("Circulo : " + c);
		System.out.println("Circulo centro : " + c.getCentro());
		System.out.println("Circulo radio : " + c.getRadio());
		System.out.println("Circulo area : " + c.getArea());

	}

}
