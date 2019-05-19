package tipos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonaImpl implements Persona {
 private String nombre;
 private String apellidos;
 private LocalDate fechaNacimiento;

public PersonaImpl(String nombre, String apellidos) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	fechaNacimiento = LocalDate.now();
	
}
public PersonaImpl(String nombre, String apellidos, LocalDate fechaNacimiento) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.fechaNacimiento = fechaNacimiento;
}
//Formato de la linea de datos:  Nombre,Apellidos,dia,mes,año
public PersonaImpl(String s) {
	String[] aux = s.split(",");
	this.nombre = aux[0];
	this.apellidos = aux[1];
	this.fechaNacimiento = LocalDate.of(new Integer(aux[4]), new Integer(aux[3]), new Integer(aux[2]));
}

public String getNombre() {
	return nombre;
}
public String getApellidos() {
	return apellidos;
}
 

public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
}

public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
public Integer getEdad() {
	return (int) getFechaNacimiento().until(LocalDate.now(),
			ChronoUnit.YEARS);
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
	result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PersonaImpl other = (PersonaImpl) obj;
	if (apellidos == null) {
		if (other.apellidos != null)
			return false;
	} else if (!apellidos.equals(other.apellidos))
		return false;
	if (nombre == null) {
		if (other.nombre != null)
			return false;
	} else if (!nombre.equals(other.nombre))
		return false;
	return true;
}
@Override
public String toString() {
	return "PersonaImpl [nombre=" + nombre + ", apellidos=" + apellidos +
			"]("+getEdad()+")";
}

@Override
public int compareTo(Persona p) {
	// TODO Auto-generated method stub
	int res=this.getApellidos().compareTo(p.getApellidos()); 
	if (res==0) 
		res=this.getNombre().compareTo(p.getNombre()); 
	return res; 

}
}
