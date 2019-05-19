/*CLASE CUENTA
 * Ex POO: 
 * https://puntocomnoesunlenguaje.blogspot.com/2015/04/ejercicio-basico-poo-java.html
 * 
 */
public class Cuenta {

	private String nombre;
	private String numeroCuenta;
	private Double tipoInteres;
	private Double saldo;

	// Constructor por defecto
	public Cuenta() {
	}

	// Constructor con todos sus parámetros
	public Cuenta(String nombre, String numeroCuenta, Double tipoInteres, Double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	// Constructor copia

	public Cuenta(final Cuenta c) {

		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(Double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	// Ingreso

	public boolean Ingreso(double saldo) {

		boolean ingresoCorrecto = true;

		if (saldo < 0) {

			ingresoCorrecto = false;
		} else {

			saldo += saldo;

		}

		return ingresoCorrecto;
	}

	// Reintegro

	public boolean Reintegro(double saldo) {

		boolean reintegroCorrecto = true;

		if (saldo < 0) {

			reintegroCorrecto = false;

		} else {

			saldo -= saldo;
		}

		return reintegroCorrecto;
	}

	// Metodo transferencia

	public boolean Transferencia(Cuenta c, double saldo) {

		boolean correcto = true;

		if (saldo < 0) {
			correcto = false;

		} else if (saldo >= saldo) {
			Reintegro(saldo);
			c.Ingreso(saldo);

		} else {
			correcto = false;
		}

		return correcto;
	}

}
