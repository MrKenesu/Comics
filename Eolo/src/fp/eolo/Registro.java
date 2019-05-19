package fp.eolo;

import java.time.LocalDate;

import fp.utiles.Checkers;

public class Registro implements Comparable<Registro>{
	//Atributos
	private LocalDate fecha;
	private String ciudad;
	private Double direccion;
	private Double velocidadMedia;
	private Double velocidadMaxima;
	
	//Constructor
	public Registro(LocalDate fecha, String ciudad, Double direccion, Double velocidadMedia, Double velocidadMaxima) {
		Checkers.check("La velocidad media no puede superar a la máxima.", velocidadMedia < velocidadMaxima);
		this.fecha = fecha;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.velocidadMedia = velocidadMedia;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//Getters --> si tuvieramos setters también, habría que introducirle una excepción
	public LocalDate getFecha() {
		return fecha;
	}

	public String getCiudad() {
		return ciudad;
	}

	public Double getDireccion() {
		return direccion;
	}

	public Double getVelocidadMedia() {
		return velocidadMedia;
	}

	public Double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	//Métodos getDia, getMes, getAño
	
	public Integer getDia() {
		
		return this.fecha.getDayOfYear();
		
	}
	
	public Integer getMes() {
		return this.fecha.getMonthValue();
		
	}
	
	public Integer getAño() {
		return this.fecha.getYear();
	}
	
	//Método getViento()
	
	public Viento getViento() {
		Viento x = null;
		//solamente se puede poner 1 condicion
		if(135 >= direccion && direccion <= 225) {
			x = Viento.SUR;	
		}
		else if (225>= direccion && direccion <= 315) {
			x = Viento.PONIENTE;
			
		}
		else if (direccion>315 || direccion<45) {
			x = Viento.NORTE;
			
		}
		else if (45>= direccion && direccion<= 135) {
			if (velocidadMedia<3) {
				x = Viento.LEVANTICHON;		
			}
			
			else {
				x = Viento.LEVANTE;
			}
			
		}
		return x;
		
	}
	//toString
	@Override
	public String toString() {
		return "Registro [fecha=" + fecha + ", ciudad=" + ciudad + ", direccion=" + direccion + ", velocidadMedia="
				+ velocidadMedia + ", velocidadMaxima=" + velocidadMaxima + "]";
	}
	
	//HashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
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
		Registro other = (Registro) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		return true;
	}
	
	//CompareTo
	@Override
	public int compareTo(Registro r) {
		int res;
		res = getCiudad().compareTo(r.getCiudad());
		if(res == 0){		
			res = getFecha().compareTo(r.getFecha());
		}
		return res;
		
	}
	
	
}
