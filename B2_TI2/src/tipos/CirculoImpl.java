package tipos;

public class CirculoImpl implements Circulo {
	private Punto centro;
	private Double radio;
	
	public CirculoImpl(){
		radio =1.0;
		centro = new PuntoImpl();
	}

	public CirculoImpl(Punto centro, Double radio) {
		super();
		checkRadio(radio);
		checkCentro(centro);
		this.centro = centro;
		this.radio = radio;
	}
	// formato "(lat,lon);rad"
	public CirculoImpl(String s) {
		String [] trozos = s.split(";");
		if(trozos.length != 2) {
			throw new IllegalArgumentException("Error en el troceado");
		}
		Punto c = new PuntoImpl(trozos[0]);
		Double r = new Double(trozos[1]);
		checkRadio(r);
		checkCentro(c);
		this.centro = c;
		this.radio = r;
	}


	private void checkRadio(Double radio) {
	    if (radio == null || radio<=0.0){
	        throw new IllegalArgumentException("Radio menor o igual que 0 o null");
	    }
	}
	private void checkCentro(Punto centro) {
	    if (centro== null){
	        throw new IllegalArgumentException("El centro es null");
	    }
	}

	public Punto getCentro() {
		return centro;
	}
	public Double getRadio() {
		return radio;
	}
	public void setCentro(Punto centro) {
		checkCentro(centro);
		this.centro = centro;
	}
	public void setRadio(Double radio) {
		checkRadio(radio);
		this.radio = radio;
	}
	@Override
	public Double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*getRadio()*getRadio();

	}
	@Override
	public Double getLongitud() {
		// TODO Auto-generated method stub
		return Math.PI*getRadio()*2;

	}
	@Override
	public Double distancia(Circulo c) {
		// TODO Auto-generated method stub
		return this.getCentro().getDistancia(c.getCentro());
	}
	@Override
	public String toString() {
		return "CirculoImpl [centro=" + centro + ", radio=" + radio + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		result = prime * result + ((radio == null) ? 0 : radio.hashCode());
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
		CirculoImpl other = (CirculoImpl) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (radio == null) {
			if (other.radio != null)
				return false;
		} else if (!radio.equals(other.radio))
			return false;
		return true;
	}
	
}
