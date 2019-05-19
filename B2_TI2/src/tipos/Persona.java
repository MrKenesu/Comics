package tipos;

import java.time.LocalDate;

public interface Persona extends Comparable<Persona> {
	public String getNombre(); 
	public String getApellidos(); 
	LocalDate getFechaNacimiento();
	Integer getEdad();
	void setFechaNacimiento(LocalDate fecha);

}
