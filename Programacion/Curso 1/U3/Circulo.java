package U3;
public class Circulo {
private double Radio;
private Punto Centro;
public Circulo(){
	this.Radio=0.0;
	this.Centro=new Punto();
}
public Circulo(Punto p,double r) {
	this.Centro=p;
	this.Radio=r;
}
public double Radio() {
	return this.Radio;
}
public Punto Centro() {
	return this.Centro;
}
public void Radio(double r) {
	this.Radio=r;
	}
public void Centro(Punto p) {
	this.Centro=p;
	}
public void trasladar ( double a,double b) {
	this.Centro.trasladar(a,b);
}
public String toString() {
	return("Circulo("+Radio+","+Centro+")");
	}
}