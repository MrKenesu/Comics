package fp.inspecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FactoriaInspecciones {
	
	//atributo
	private List<Inspeccion> inspecciones;

	//Constructor vacio
	public FactoriaInspecciones() {
		this.inspecciones = new ArrayList<Inspeccion>();
	}

	//Constructor con stream
	
	public FactoriaInspecciones(Stream<Inspeccion> inspecciones) {
		this.inspecciones = inspecciones.collect(Collectors.toList());
	}
	
	//Método getInspecciones
	
	public List<Inspeccion> getInspecciones(){
		return null;
		
	}
	
	
	
	
	

}
