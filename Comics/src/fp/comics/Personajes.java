package fp.comics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Personajes {
	//Atributo con la lista de objetos Personaje
	private List<Personaje> personajes = new ArrayList<Personaje>();

	//Constructor vacío
	public Personajes() {
		//this.personajes = personajes = new ArrayList<Personaje>();
		
	}
	//Constructor de Personajes a partir de un *stream* de Personaje(clase)

	public Personajes(Stream<Personaje> personajes) {
		this.personajes = personajes.collect(Collectors.toList());
		// Collectors.toList() --> convierten un Stream en lista
	}
	
	//Método añadirPersonaje(Personaje)
	
	public void añadirPersonaje(Personaje p) {
		personajes.add(p);
		/*
		 * A la lista personajes le hemos añadido el parámetro p
		 */	
	}
	
	//toString--> se hace desde el source-> generate toString
	@Override
	public String toString() {
		return "Personajes [personajes=" + personajes + "]";
	}

	//Hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((personajes == null) ? 0 : personajes.hashCode());
		return result;
	}
	
	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personajes other = (Personajes) obj;
		if (personajes == null) {
			if (other.personajes != null)
				return false;
		} else if (!personajes.equals(other.personajes))
			return false;
		return true;
	}
	
	// Método obtenerPersonajesDeSexoOrdenados -> filtrado
	
	
	public Collection<Personaje> obtenerPersonajesDeSexoOrdenados(String sexo){
		Collection<Personaje> p1 = new ArrayList<Personaje>();
		for (Personaje personaje : personajes) {
			//  el tipo "individual" de cada uno de los elementos de la lista que hay a la derecha : La lista/ conjunto o lo que sea que recorre
			if(personaje.getSexo().equals(sexo)) {
				p1.add(personaje);
			}
			
		}
			
		return p1;	
	}
	
	// método obtenerPersonajesOrdenadosPorPelo
	
	public Collection<Personaje> obtenerPersonajesOrdenadosPorPelo(String pelo){
		ArrayList<Personaje> p2 = new ArrayList<Personaje>();
		for (Personaje personaje : personajes) {
			if (personaje.getPelo().equals(pelo)) {
				p2.add(personaje);
			}
			
		}
		Collections.sort(p2, Comparator.comparing(Personaje::getPelo));
		return p2;
		
	}
	
	//metodo 
	
	public Boolean hayPersonajePeloOjos(String pelo, String ojos) {
		Boolean valor = false;
		for (Personaje personaje : personajes) {
			if(personaje.getPelo().equals(pelo)) {
				if(personaje.getOjos().equals(ojos)) {
					valor = true;
				}
			}
		}
		
		return valor;
			
		
	}
	
	
	
	
	

}
