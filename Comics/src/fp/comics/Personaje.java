package fp.comics;

import fp.utiles.Checkers;

public class Personaje {
	
	// Atributos
	private String nombre;
	private String tipo;
	private String ojos;
	private String pelo;
	private String sexo;
	private Integer añoAparicion;
	
	//Consttructor
	/*
	 * Para hacer un constructor rápidamente damos click derecho-> source
	 * -> generate constructor using fields y elegimos los atributos que nos piden
	 */
	public Personaje(String nombre, String tipo, String ojos, String pelo, String sexo, Integer añoAparicion) {
		Checkers.check("El añoAparición debe ser igual o posterior a 1930", añoAparicion>=1930);
		//En los checkers ponemos las restricciones de los atributos
		this.nombre = nombre;
		this.tipo = tipo;
		this.ojos = ojos;
		this.pelo = pelo;
		this.sexo = sexo;
		this.añoAparicion = añoAparicion;
	}
	
	//Getters
	/*
	 * Para hacer los getters (ambos o setters también) rápidamente le damos
	 * a click derecho, source, generate getters and setters y elegimos lo que
	 * necesitamos, en este caso le hemos dado a select getters porque
	 * solamente nos pide en el ejercicio eso
	 */
	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public String getOjos() {
		return ojos;
	}

	public String getPelo() {
		return pelo;
	}

	public String getSexo() {
		return sexo;
	}

	public Integer getAñoAparicion() {
		return añoAparicion;
	}
	
	/*
	 *  Nota: si en este ejercicio nos hubieran pedido setters,
	 *  deberíamos pasarle las restricciones que nos pidieron en
	 *  los atributos (en este caso solamente la de añoAparicion)
	 */
	
	// método getDecada
	public String getDecada(){
		String decada = Integer.toString(añoAparicion);
		decada = decada.substring(0, 3) + "0";
		return decada;
		
	}
	
	//Hashcode-> se saca de source, al igual que por ejemplo los getters

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((añoAparicion == null) ? 0 : añoAparicion.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((ojos == null) ? 0 : ojos.hashCode());
		result = prime * result + ((pelo == null) ? 0 : pelo.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}
	//Equals--> igual que Hashcode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		if (añoAparicion == null) {
			if (other.añoAparicion != null)
				return false;
		} else if (!añoAparicion.equals(other.añoAparicion))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (ojos == null) {
			if (other.ojos != null)
				return false;
		} else if (!ojos.equals(other.ojos))
			return false;
		if (pelo == null) {
			if (other.pelo != null)
				return false;
		} else if (!pelo.equals(other.pelo))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
	//CompareTo
	
	public int compareTo(Personaje p) {
		int res;
		res = getAñoAparicion().compareTo(p.getAñoAparicion());
		return res;
		
	}
	
	
	

}
