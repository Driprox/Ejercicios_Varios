package U3;
public class Cilindro {
	private double Altura;
	private Circulo Base;
	public Cilindro() {
		this.Altura=0.0;
		this.Base= new Circulo();
		}
	public Cilindro(Circulo b,double a) {
		this.Base=b;
		this.Altura=a;
			}
	public double Altura() {
		return this.Altura;
	}
	public Circulo Base() {
		return this.Base;
	}
	public void Altura(double a) {
		this.Altura=a;}
	public void Base(Circulo b) {
		this.Base=b;
	}
	public void trasladar (double a,double b) {
		this.Base.trasladar(a, b);
	}
	public String toString() {
		return("Cilindro("+Altura+","+this.Base()+")");
		}
	}