package fp.tipo;

import java.time.LocalDate;

public class Vuelo {
	
	private String origen;
	private String destino;
	private LocalDate fechaSalida;
	private Integer numeroPasajeros;
	private Compañia compañia;
	
	public Vuelo(String origen, String destino, LocalDate fechaSalida, Integer numeroPasajeros, Compañia compañia) {
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.numeroPasajeros = numeroPasajeros;
		this.compañia = compañia;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Integer getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(Integer numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public Compañia getCompañia() {
		return compañia;
	}

	public void setCompañia(Compañia compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Vuelo [origen=" + origen + ", destino=" + destino + ", fechaSalida=" + fechaSalida
				+ ", numeroPasajeros=" + numeroPasajeros + ", compañia=" + compañia + "]";
	}
	
	
	
	
	

}
