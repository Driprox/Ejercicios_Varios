package U3;
import java.util.Scanner;
public class Mainpunto {
	public static void main(String[] args) {
		double x1,y1,x,y,e,t;
		Scanner sc= new Scanner(System.in);
		System.out.println("Punto 1 dime la x: ");
		x=sc.nextDouble();
		System.out.println("Punto 1 dime la y: ");
		y=sc.nextDouble();
		Punto punto1= new Punto();
		punto1.abcisa(x);
		punto1.ordenada(y);
		System.out.print(punto1);
		System.out.println("\nPunto 2 dime la x: ");
		 x1=sc.nextDouble();
	    System.out.println("Punto 2 dime la y: ");
	     y1 =sc.nextDouble();
	    Punto punto2=new Punto();
	    punto2.abcisa(x1);
	    punto2.ordenada(y1);
	    System.out.print(punto2);
	    System.out.println("\nIntroduce las cordenadas de aumento para el traslado del punto 1: ");
	    e=sc.nextDouble();
	    t=sc.nextDouble();
	    punto1.trasladar(e, t);	    
	    System.out.println("\nLas coordendas de punto 1 es: " +punto1.abscisa()+","+punto1.ordenada());
	    System.out.println("Las coordendas de punto 2 es: " +punto2.abscisa()+","+punto2.ordenada());
	    System.out.println("La distancia entre punto1 y punto2 es de: "+punto1.distancia(punto2));
	sc.close();
	}
	}