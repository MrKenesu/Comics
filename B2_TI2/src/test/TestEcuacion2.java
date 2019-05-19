package test;

public class TestEcuacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Casos de prueba ecuación de segundo grado
		// ax2 + bx +c = 0
		// Double a = 1.0, b = 4.0 , c=3.0; // raices reales
		// Double a = 1.0, b = 4.0 , c=4.0; // raices reales dobles
		// Double a = 2.0, b = 3.0 , c=3.0; // raices imaginarias
		// Double a = 0.0, b = 5.0 , c=4.0; // es ecuación de primer grado no de segundo

		solucionEcuacionGrado2(1.0, 4.0, 3.0);
		solucionEcuacionGrado2(1.0, 4.0, 4.0);
		solucionEcuacionGrado2(2.0, 3.0, 3.0);
		solucionEcuacionGrado2(0.0, 5.0, 4.0);

	}

	public static void solucionEcuacionGrado2(Double a, Double b, Double c) {
	/**/	if (a == 0.0) {
			throw new IllegalArgumentException("La ecuación es de grado 1");
		}
		Double discriminante = b * b - 4 * a * c;
		System.out
				.println("Ecuación : " + a + "X2 + " + b + "X + " + c + " =  0 " + " Discriminante = " + discriminante);
		Double x1, x2;
		Double real, imaginaria;
		if (discriminante >= 0) {
			x1 = (-b + Math.sqrt(discriminante)) / 2 / a;
			x2 = (-b - Math.sqrt(discriminante)) / 2 / a;
			System.out.println(" x1 = " + x1);
			System.out.println(" x2 = " + x2);
			System.out.println(" === Fin de resultados === ");
		} else {
			real = -b / 2 / a;
			imaginaria = Math.sqrt(-discriminante) / 2 / a;
			System.out.println(" Parte real = " + real);
			System.out.println(" Parte imaginaria = " + imaginaria);
			System.out.println(" === Fin de resultados === ");
		}
	} // Fin metodo static
}
