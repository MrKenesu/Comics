package fp.tipo.test;

import java.time.LocalDate;
import java.util.ArrayList;

import fp.tipo.Cancion;
import fp.tipo.Genero;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cancion c1 = new Cancion("Welcome to the jungle", "G&ROSES", 435, LocalDate.of(1987, 10, 3), Genero.Rock);
		System.out.println(c1);
	
		c1.setAutor("Almudena");
		c1.setDuracion(23437);
		
		
		System.out.println(c1);
		
		Cancion c2 = new Cancion("Baby Girl", "Almudena", 150, LocalDate.now(), Genero.Pop);
		
		System.out.println(c2);
		
		ArrayList canciones = new ArrayList();
		canciones.add(c1);
		canciones.add(c2);
		
		System.out.println("Las canciones son" + canciones);
		
		System.out.println(c1.compareTo(c2));
	}

}
