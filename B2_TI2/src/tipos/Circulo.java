package tipos;

public interface Circulo {
	  Punto getCentro(); 
	  Double getRadio();
	  Double getArea();
	  Double getLongitud();   
	  void setCentro(Punto p);
	  void setRadio(Double r);
	  Double distancia(Circulo c);

}
