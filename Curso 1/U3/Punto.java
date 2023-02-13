package U3;
public class Punto {
private double x;
private double y;
public Punto() {this(0,0);}
public Punto(double a,double b) {
	x=a;
	y=b;
}
public double abscisa() {return x;}
public double ordenada() {return y;}
public void trasladar (double a , double b) {
	x=x+a;
	y=y+b;
}
public void abcisa( double a) {x=a;}
public void ordenada(double b) {y=b;}
public double distancia(Punto p) {
	double res = Math.sqrt(Math.pow((p.abscisa()-this.abscisa()),2)+
	             Math.pow((p.ordenada()-this.ordenada()),2));
	return res;}
public String toString() {
	return("("+abscisa()+","+ordenada()+")");}
}