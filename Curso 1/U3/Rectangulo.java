package U3;
public class Rectangulo {
	private double largo;
	private double ancho;
public Rectangulo(double larg, double anc) {
	this.largo=larg;
	this.ancho=anc;	
}
public double area() {
	return ancho*largo;
}
public double perimetro() {
	return (2*(ancho+largo));
}
}