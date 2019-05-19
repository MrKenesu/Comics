package fp.tipo.test;

import java.time.LocalDate;
import java.util.ArrayList;

import fp.tipo.Compañia;
import fp.tipo.Vuelo;

public class TestVuelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vuelo v1 = new Vuelo("Madrid", "Lima", LocalDate.of(2019, 6, 12), 350, Compañia.IBE);

		System.out.println(v1);
		
		v1.setDestino("Paris");
		v1.setNumeroPasajeros(230);
		
		System.out.println(v1);
		
		Vuelo v2 = new Vuelo("Sevilla", "Curazao", LocalDate.of(2018, 2, 12), 550, Compañia.VLG);
		
		System.out.println(v2);
		
		v2.setDestino("Barcelona");
		v2.setNumeroPasajeros(222);
		
		
		System.out.println(v2);
		ArrayList lista = new ArrayList();
		
		lista.add(v1);
		lista.add(v2);
		
		System.out.println("Los vuelos más importantes de estos años han sido " + lista);
		
		
	}

}
