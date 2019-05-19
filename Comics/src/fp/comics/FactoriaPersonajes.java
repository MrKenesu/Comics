package fp.comics;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FactoriaPersonajes {

	private static Personaje parsearPersonaje(String leerCSV) {
		// Creamos el array donde dividiremos la linea del CSV en trozos mediante split
		String[] campo = leerCSV.split(",");

		// Creemos las restricciones
		if (campo.length != 6) {
			throw new IllegalArgumentException("El tamaño no es valido" + campo.length);

		}

		// creemos las variables que vamos a devolver en el objeto

		String nombre = campo[0].trim();
		String tipo = campo[1].trim();
		String ojos = campo[2].trim();
		String pelo = campo[3].trim();
		String sexo = campo[4].trim();
		Integer añoAparicion = Integer.valueOf(campo[5].trim());

		return new Personaje(nombre, tipo, ojos, pelo, sexo, añoAparicion);
	}

	public static Personajes leerPersonajes(String fichero) {

		Personajes ap = null;
		try {
			Stream<Personaje> sv = Files.lines(Paths.get(fichero), StandardCharsets.UTF_8).skip(1)
					.map(FactoriaPersonajes::parsearPersonaje);

			ap = new Personajes(sv);

		} catch (IOException e) {

			System.out.println("Fichero no encontrado " + fichero);
			
			e.printStackTrace();
		}
		return ap;

	}

}
