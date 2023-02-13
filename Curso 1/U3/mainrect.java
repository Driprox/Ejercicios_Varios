package U3;
import java.util.Scanner;
public class mainrect {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Rectangulo R;
		double L,A;
		System.out.println("Introduce los datos: ");
		System.out.print("Largo: ");
		L= sc.nextDouble();
		System.out.print("Ancho: ");
		A= sc.nextDouble();
		R= new Rectangulo(L,A);
		System.out.println("El resultado es: ");
		System.out.println("Area="+R.area()+" y el perimetro="+R.perimetro());
	sc.close();
	}
}