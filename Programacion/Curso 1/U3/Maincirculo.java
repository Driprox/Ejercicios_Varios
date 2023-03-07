package U3;
import java.util.Scanner;
public class Maincirculo {
	public static void main(String[] args) {
		double a,b,r,c,d;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce los puntos de coordenada del punto: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		Punto centro1= new Punto(a,b);
		System.out.println("Introduce el radio: ");
		r=sc.nextDouble();
		Circulo circulo1= new Circulo();
     	circulo1.Centro(centro1);
     	circulo1.Radio(r);
     	System.out.print(circulo1);
     	System.out.println("\nIntroduce el traslado: ");
			c=sc.nextDouble();
			d=sc.nextDouble();
     	circulo1.trasladar(c, d);	
     	System.out.print(circulo1);
	     sc.close();
	}
}