package tipos;

public class PuntoImpl2 implements Punto {
	private Double x;
	private Double y;
	public PuntoImpl2(){
		x=0.0;
		y=0.0;
	}
	public PuntoImpl2(Double l1, Double l2){
		x=l1;
		y=l2;
	}
	// formato "(x,y)"
	public PuntoImpl2(String s){
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
	public String toString(){
		String s; 
		s="(" + getX()+","+getY() + ")";
		return s;
	}

	public int hashCode(){
		return getX(). hashCode() * 31 + getY().hashCode();
	}
	@Override
	public boolean equals(Object o) {
		boolean res = false;
			if(o instanceof Punto){
		            Punto p = (Punto) o;
			    res = getX().equals(p.getX()) && getY().equals(p.getY());
			}
			return res;
	}
	

}
