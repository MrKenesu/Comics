package tipos;

public class PuntoImpl implements Punto {
	private Double x;
	private Double y;
	public PuntoImpl(){
		x=0.0;
		y=0.0;
	}
	public PuntoImpl(Double l1, Double l2){
		x=l1;
		y=l2;
	}
	// formato "(x,y)"
	public PuntoImpl(String s){
		String s1 = s.replace("(","").replace(")","");
		String [] trozos = s1.split(",");
		if(trozos.length != 2) {
			throw new IllegalArgumentException("Error en el troceado");
		}
		x= new Double(trozos[0].trim());
		y=new Double(trozos[1].trim());
	}

	@Override
	public Double getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public void setX(Double cx) {
		// TODO Auto-generated method stub
		x = cx;
	}

	@Override
	public Double getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public void setY(Double cy) {
		// TODO Auto-generated method stub
		y = cy;
	}

	@Override
	public Double getDistancia(Punto c) {
		// TODO Auto-generated method stub
		Double d1 = x - c.getX();
		Double d2 = y - c.getY();
		return Math.sqrt(d1*d1+d2*d2);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((y == null) ? 0 : y.hashCode());
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
		PuntoImpl other = (PuntoImpl) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PuntoImpl [x=" + x + ", y=" + y + "]";
	}

}
