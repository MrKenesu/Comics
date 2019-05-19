package tipos;

public class PuntoImpl1 implements Punto {
	private Double x;
	private Double y;
	public PuntoImpl1(){
		x=0.0;
		y=0.0;
	}
	public PuntoImpl1(Double l1, Double l2){
		x=l1;
		y=l2;
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
}
