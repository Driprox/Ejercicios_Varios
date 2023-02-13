package U4;
public class Libro_oferta {
private double porcDescuento;
private Libro base;
public Libro_oferta(double des, Libro b) {
	porcDescuento = des;
	base = b;
}
public double getdescuento() {
	return porcDescuento;
}
public double getpreciofinal() {
	return base.getPreciofinal()- base.getPreciofinal()*porcDescuento/100;
}
public String toString() {
	return "Libro_oferta [porcDescuento=" + porcDescuento + ", base=" + base + "]";
}
}