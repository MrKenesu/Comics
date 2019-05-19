package fp.inspecciones;

import java.time.LocalDate;
import java.time.Period;

public class Inspeccion {
	
	//atributos 
	private String id;
	private String nombre;
	private String tipoCocina;
	private String descripcion;
	private LocalDate fecha;
	private Distrito distrito;
	private Boolean esCritico;
	private Double score;
	
	//Constructor

	public Inspeccion(String id, String nombre, String tipoCocina, String descripcion, LocalDate fecha,
			Distrito distrito, Boolean esCritico, Double score) {
		this.id = id;
		this.nombre = nombre;
		this.tipoCocina = tipoCocina;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.distrito = distrito;
		this.esCritico = esCritico;
		this.score = score;
	}
	
	//Getters 

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipoCocina() {
		return tipoCocina;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public Boolean getEsCritico() {
		return esCritico;
	}

	public Double getScore() {
		return score;
	}
	
	public void setEsCritico(Boolean esCritico) {
		this.esCritico = esCritico;
	}
	
	//getTiempoTranscurrido()

	public Period getTiempoTranscurrido() {
		return Period.between(fecha, LocalDate.now());
	/*
	 * Period.between(fecha1,fecha2)-> Obtiene un período que consta 
	 * de la cantidad de años, meses y días entre dos fechas.
	 */
		
	}
	
	//toString
	@Override
	public String toString() {
		return "Inspeccion [nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha + ", esCritico="
				+ esCritico + ", score=" + score + "]";
	}
	
	//EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

		
	//HashCode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inspeccion other = (Inspeccion) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
