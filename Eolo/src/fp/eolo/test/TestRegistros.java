package fp.eolo.test;
/**
 * @author José A. Troyano
 * @author José C. Riquelme
 * 
 * @since 2019-04-03
 */

import java.lang.Exception;
import java.lang.String;
import java.lang.System;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import fp.eolo.FactoriaRegistros;
import fp.eolo.Registro;
import fp.eolo.Registros;
import fp.eolo.Viento;

public class TestRegistros {
	private static Registros registros = new Registros();
	
	public static void main(String[] args) {
		testConstructor();
		testAñadirRegistro();
		testCalcularRegistrosDeViento();
		testCalcularDiasDeVientoEnCiudadEnFechas();
		testObtenerRegistrosMayorVelocidadMaxima();
		testCalcularPromedioVelocidadMediaEnAño();
		testCalcularVelocidadMediaPorFecha();
		testOrdenarVelocidadesMediasPorFecha();
		testCalcularRegistroMayorVelocidadMaximaPorCiudad();
		testCalcularVientoPredominanteDeCiudad();
		testCalcularVelocidaMediaDeVientoPorCiudad();
		testGenerarDiagramaBarras();
	}

	
	public static void testConstructor() {
		System.out.println("\nTest del Constructor");
		
		try {
			List<Registro>lista=new ArrayList<Registro>();
			lista.add(new Registro(LocalDate.parse("2000-01-01"),"Jaén",190.0,3.96,16.92));
			lista.add(new Registro(LocalDate.parse("2000-01-02"),"Jaén",185.0,5.04,15.12));
			lista.add(new Registro(LocalDate.parse("2000-01-03"),"Jaén",180.0,5.04,16.92));
			lista.add(new Registro(LocalDate.parse("2000-01-04"),"Jaén",170.0,2.16,25.92));
			lista.add(new Registro(LocalDate.parse("2000-01-05"),"Jaén",155.0,6.12,12.96));
			lista.add(new Registro(LocalDate.parse("2000-01-06"),"Jaén",140.0,5.04,21.96));
			lista.add(new Registro(LocalDate.parse("2000-01-07"),"Jaén",150.0,1.08,19.08));
			lista.add(new Registro(LocalDate.parse("2000-01-08"),"Jaén",230.0,2.16,14.04));
			lista.add(new Registro(LocalDate.parse("2000-01-09"),"Jaén",170.0,2.88,14.04));
			
			registros = new Registros(lista.stream());	
	    	System.out.println("   REGISTROS: "+ registros);
	    } catch (Exception e) {
	    	System.out.println("Excepción capturada:\n   " + e);
	    }
	}

	public static void testAñadirRegistro() {
		System.out.println("\nTest de añadirRegistro");
		try {
			registros.añadirRegistro(new Registro(LocalDate.parse("2000-01-10"),"Jaén",140.0,6.84,47.16));
		    System.out.println("   REGISTROS: "+ registros);
		} catch (Exception e) {
			System.out.println("Excepción capturada:\n   " + e);
		}
	}

	
	public static void testCalcularRegistrosDeViento() {
	    System.out.println("\nTest de calcularRegistrosDeViento");
	    try {
	    	Registros registros = FactoriaRegistros.leerRegistros("data/registros_viento.csv");
	    	Viento viento = Viento.LEVANTICHON;
	    	System.out.println("   VIENTO: "+ viento);
	    	Collection<Registro> coleccionRegistros = registros.calcularRegistrosDeViento(viento);
	    	System.out.println("   NUMERO DE REGISTROS: "+ coleccionRegistros.size());
	    } catch (Exception e) {
	    	System.out.println("Excepción capturada:\n   " + e);
	    }
	}
	
	public static void testCalcularDiasDeVientoEnCiudadEnFechas() {
	    System.out.println("\nTest de calcularDiasDeVientoEnCiudadEnFechas");
	    try {
	    	Registros registros = FactoriaRegistros.leerRegistros("data/registros_viento.csv");
	    	String ciudad = "Tarifa";
	    	Viento viento = Viento.LEVANTE;
	    	LocalDate fechaInicio = LocalDate.parse("2008-10-01");
	    	LocalDate fechaFin = LocalDate.parse("2008-10-31");
	    	System.out.println("   VIENTO: " + viento);
	    	System.out.println("   CIUDAD: " + ciudad);
	    	System.out.println("   FECHA INICIO: " + fechaInicio);
	    	System.out.println("   FECHA FIN: " + fechaFin);
	    	System.out.println("   DIAS: "+ 
	    	                   registros.calcularDiasDeVientoEnCiudadEnFechas(viento, ciudad, fechaInicio, fechaFin));  
	    } catch (Exception e) {
	    	System.out.println("Excepción capturada:\n   " + e);
	    }
	}
	
	public static void testObtenerRegistrosMayorVelocidadMaxima() {
	    System.out.println("\nTest de obtenerRegistrosMayorVelocidadMaxima");
	    try {
	    	Registros registros = FactoriaRegistros.leerRegistros("data/registros_viento.csv");
	    	System.out.println("   REGISTROS: "+ registros.obtenerRegistrosMayorVelocidadMaxima(5));
	    } catch (Exception e) {
	    	System.out.println("Excepción capturada:\n   " + e);
	    }
	}
	
	
	public static void testCalcularPromedioVelocidadMediaEnAño() {
	    System.out.println("\nTest de calcularPromedioVelocidadMediaEnAño");
	    try {
	    	Registros registros = FactoriaRegistros.leerRegistros("data/registros_viento.csv");
	    	Integer año = 2001;
	    	System.out.println("   AÑO: "+ año);
	    	System.out.println("   VELOCIDAD PROMEDIO: "+ registros.calcularPromedioVelocidadMediaEnAño(año));
	    } catch (Exception e) {
	    	System.out.println("Excepción capturada:\n   " + e);
	    }
	}
	
	public static void testCalcularVelocidadMediaPorFecha() {
	    System.out.println("\nTest de calcularVelocidadMediaPorFecha");
	    try {
	    	Registros registros = FactoriaRegistros.leerRegistros("data/registros_viento.csv");
	    	Map<LocalDate, Double> velocidades = registros.calcularVelocidadMediaPorFecha();
	    	LocalDate fecha = LocalDate.parse("2000-01-01");
	    	System.out.println("   FECHA: "+ fecha);
	    	System.out.println("   NÚMERO DE FECHAS: "+ velocidades.size());
	    	System.out.println("   MEDIA PARA "+ fecha + ": " + velocidades.get(fecha));
	    } catch (Exception e) {
	    	System.out.println("Excepción capturada:\n   " + e);
	    }
	}
	
	
	public static void testOrdenarVelocidadesMediasPorFecha() {
	    System.out.println("\nTest de ordenarVelocidadesMediasPorFecha");
	    try {
	    	Registros registros = FactoriaRegistros.leerRegistros("data/registros_viento.csv");
	    	System.out.println("   VELOCIDADES: "+ registros.ordenarVelocidadesMediasPorFecha(5));
	    } catch (Exception e) {
	    	System.out.println("Excepción capturada:\n   " + e);
	    }
	}
	
	public static void testCalcularRegistroMayorVelocidadMaximaPorCiudad() {
	    System.out.println("\nTest de calcularRegistroMayorVelocidadMaximaPorCiudad");
	    try {
	    	Registros registros = FactoriaRegistros.leerRegistros("data/registros_viento.csv");
	    	System.out.println("   REGISTROS: "+ registros.calcularRegistroMayorVelocidadMaximaPorCiudad());
	    } catch (Exception e) {
	    	System.out.println("Excepción capturada:\n   " + e);
	    }
	}
	
	
	public static void testCalcularVientoPredominanteDeCiudad() {
	    System.out.println("\nTest de calcularVientoPredominanteDeCiudad");
	    try {
	    	Registros registros = FactoriaRegistros.leerRegistros("data/registros_viento.csv");
	    	String ciudad = "Cádiz";
	    	System.out.println("   CIUDAD: "+ ciudad);
	    	System.out.println("   VIENTO: "+ registros.calcularVientoPredominanteDeCiudad(ciudad));
	    	
	    	ciudad = "Tarifa";
	    	System.out.println("   CIUDAD: "+ ciudad);
	    	System.out.println("   VIENTO: "+ registros.calcularVientoPredominanteDeCiudad(ciudad));
	    } catch (Exception e) {
	    	System.out.println("Excepción capturada:\n   " + e);
	    }
	}
	
	
	public static void testCalcularVelocidaMediaDeVientoPorCiudad() {
	    System.out.println("\nTest de calcularVelocidaMediaDeVientoPorCiudad");
	    try {
	    	Registros registros = FactoriaRegistros.leerRegistros("data/registros_viento.csv");
	    	Viento viento = Viento.LEVANTE;
	    	System.out.println("   VIENTO: "+ viento);
	    	System.out.println("   VELOCIDADES: "+ registros.calcularVelocidaMediaDeVientoPorCiudad(viento));
	    } catch (Exception e) {
	    	System.out.println("Excepción capturada:\n   " + e);
	    }
	}
	
/*
	public static void testGenerarDiagramaBarras() {
	    System.out.println("\nTest de generarDiagramaBarras");
	    try {
	    	Registros registros = FactoriaRegistros.leerRegistros("data/registros_viento.csv");
	    	
	    	registros.generarDiagramaBarras("levante_poniente.html",Viento.LEVANTE, Viento.PONIENTE);
	    	System.out.println("  DIAGRAMA GENERADO EN ./out/levante_poniente.html");
	    	
	    	registros.generarDiagramaBarras("norte_sur.html",Viento.NORTE, Viento.SUR);
	    	System.out.println("  DIAGRAMA GENERADO EN ./out/norte_sur.html");

	    } catch (Exception e) {
	    	System.out.println("Excepción capturada:\n   " + e);
	    }
	}
	*/
}