package fp.eolo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class FactoriaRegistros {
	
	private static Registro parsearRegistros(String leerCSV) {
		String[] campo = leerCSV.split(",");
		if (campo.length != 5) {
			throw new IllegalArgumentException("formato de cadena no valido" + campo.length);
		}
		
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate fecha = LocalDate.parse(campo[0], formatter);	 // LocalDate.of(new Integer(campo[0])
	String ciudad = campo[1].trim(); // trim()-> Método que elimina los caracteres blancos iniciales y finales de la cadena, devolviendo una copia de la misma. 
	Double direccion = new Double(campo[2].trim());
	Double velocidadMedia = new Double(campo[3].trim());
	Double velocidadMaxima = new Double(campo[4].trim());
		
	return new Registro(fecha, ciudad, direccion, velocidadMedia, velocidadMaxima);
		
		
	}
	
	
	public static Registros leerRegistros(String nomfich) {
		 	Registros ap = null;
		try {
		Stream<Registro> sv = Files.lines(Paths.get(nomfich), StandardCharsets.UTF_8).skip(1)
				 .map(FactoriaRegistros::parsearRegistros);
		
		ap = new Registros(sv);
		
		} catch (IOException e) {
			
		System.out.println("Fichero no encontrado " + nomfich);
		e.printStackTrace();//Es un método en instancias de Excepción 
		//que imprime el seguimiento de la pila de la instancia en System.err.

		}
		return ap;
		}
	
	
	
	
	

}
