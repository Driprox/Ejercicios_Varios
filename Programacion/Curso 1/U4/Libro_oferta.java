package U4;

public class Libro_oferta extends Libro {
	private double porcDescuento;
	private Libro base;

	public Libro_oferta(String a, String t, double p, double porcDescuento, Libro base) {
		super(a, t, p);
		this.porcDescuento = porcDescuento;
		this.base = base;
	}

	public double getdescuento() {
		return porcDescuento;
	}

	public double getpreciofinal() {
		return base.getPreciofinal() - base.getPreciofinal() * porcDescuento / 100;
	}

	public String toString() {
		return "Libro_oferta [porcDescuento=" + porcDescuento + ", base=" + base + "]";
	}
}