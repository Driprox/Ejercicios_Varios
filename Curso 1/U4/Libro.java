package U4;
public class Libro {
private String autor;
private String titulo;
private double preciobase;
private static double porcIVA;
public Libro(String a,String t ,double p) {
	autor=a;
	titulo=t;
	preciobase=p;
	Libro.porcIVA=4;
}
public String getAutor() {
	return autor;}
public String getTitulo() {
	return titulo;}
public double getPreciobase() {
	return preciobase;}
public static double getPorcIVA() {
	return porcIVA;}
public static void setPorcIVA(double porcIVA) {
	Libro.porcIVA = porcIVA;}
public double getPreciofinal() {
	return preciobase + preciobase*Libro.porcIVA/100;
}
public String toString() {
	return "Libro [autor=" + autor + ", titulo=" + titulo + ", preciobase=" + preciobase + "]";
}
}