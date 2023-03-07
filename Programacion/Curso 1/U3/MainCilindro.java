package U3;
import java.util.Scanner;
public class MainCilindro {
	public static void main(String[] args) {
		double a,b,c,d,area,volumen;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce los puntos de coordenada: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		Punto centro1= new Punto(a,b);
		System.out.println("Introduce el radio: ");
		c=sc.nextDouble();
        Circulo base1 =new Circulo (centro1,c);
        System.out.println("Introduce la altura: ");
		d=sc.nextDouble();
        Cilindro cili=new Cilindro (base1,d);
        System.out.println(cili);
        area=2*3.14*c*(c+d);
        volumen=3.14*(c*c)*d;
        System.out.println("El area es: "+area+"\nEl volumen es: "+volumen);
        sc.close();
	}
}