package fp.eolo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Registros {

	// Atributo con el conjunto de objetos Registro

	private Set<Registro> registros;

	// Constructor vacio de la clase Registros

	public Registros() {
		this.registros = new HashSet<Registro>();
	}

	// Constructor de la clase Registros a partir de un Stream de Registro
	public Registros(Stream<Registro> registros) {
		this.registros = registros.collect(Collectors.toSet());
		// Con Collectros.toSet convertimos ese stream en un conjunto
	}

	// Método añadir registro:

	public void añadirRegistro(Registro reg) {
		registros.add(reg);
	}

	// Método getNumeroRegistro:
	public Integer getNumeroRegistro() {

		return this.registros.size();

		// return (int) registros.stream().count();
		// castear --> convertir algo durante ese momento a un tipo de objeto
	}

	// toString
	@Override
	public String toString() {
		return "Registros [registros=" + registros + "]";
	}

	// HashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((registros == null) ? 0 : registros.hashCode());
		return result;
	}

	// Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registros other = (Registros) obj;
		if (registros == null) {
			if (other.registros != null)
				return false;
		} else if (!registros.equals(other.registros))
			return false;
		return true;
	}

	// Calcular registros de viento
	/*
	 * filtra el conjunto de registros por un tipo de viento recibido como parámetro
	 */
	public Collection<Registro> calcularRegistrosDeViento(Viento viento) {
		return registros.stream().filter(r -> r.getViento().equals(viento)).collect(Collectors.toSet());

		// .stream() convierte el conjunto/lista a un stream
		// .filter() permite buscar una ocurrencia y guardarla
	}

	// calcularDiasDeVientoEnCiudadEnFechas
	/*
	 * calcula el número de días de un tipo de viento en una ciudad y entre dos
	 * fechas determinadas. La fecha de inicio debe ser anterior que la fecha de
	 * fin. Las cuatro informaciones se reciben como parámetros del método.
	 */

	public Long calcularDiasDeVientoEnCiudadEnFechas(Viento viento, String ciudad, LocalDate finicio,
			LocalDate ffinal) {
		return registros.stream().filter(x -> x.getViento().equals(viento)).filter(x -> x.getCiudad().equals(ciudad))
				.filter(x -> finicio.isBefore(ffinal)).count();
	}

	// Método obtenerRegistrosMayorVelocidadMaxima
	/*
	 * obtiener los n registros con mayor velocidad máxima. El número n es recibido
	 * como parámetro.
	 */
	public List<Registro> obtenerRegistrosMayorVelocidadMaxima(Integer n) {

		return registros.stream().collect(Collectors.toList());
		//revisar luego
	}

	// calcularPromedioVelocidadMediaEnAño
	/*
	 * calcula el promedio de las
		velocidades medias en un año recibido como parámetro.
	 */

	public Double calcularPromedioVelocidadMediaEnAño(Integer vmedia) {
		
		return null;
	}

	//calcularVelocidadMediaPorFecha
	/*
	 * calcula un diccionario cuyas claves son las
		fechas, y el valor es el promedio de las velocidades medias de todas las ciudades en la
		fecha correspondiente.
	 */

	public Map<LocalDate, Double> calcularVelocidadMediaPorFecha() {
		return null;
	}

	// ordenarVelocidadesMediasPorFecha
	
	public List<Double> ordenarVelocidadesMediasPorFecha(Integer vfecha) {
		return null;
	}

	// calcularRegistroMayorVelocidadMaximaPorCiudad

	public Map<String, Registro> calcularRegistroMayorVelocidadMaximaPorCiudad() {
		return null;
	}

	// calcularVientoPredominanteDeCiudad

	public Viento calcularVientoPredominanteDeCiudad(String str) {
		return null;
	}

	// calcularVelocidaMediaDeVientoPorCiudad
	public Map<String, Double> calcularVelocidaMediaDeVientoPorCiudad(Viento v) {
		return null;
	}

	// testGenerarDiagramaBarras()
	public void testGenerarDiagramaBarras(String ficheroSalida, Viento viento1, Viento viento2) {

	}

}
