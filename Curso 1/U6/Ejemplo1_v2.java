import java.util.Scanner;

//Ejemplo: pide 10 numeros por teclado y los guarda en un array, despues lo muestra por pantalla
public class Ejemplo1_v2 {

	public static void main(String[] args) {
	   int [] v=new int[4];
		
	    Scanner sc = new Scanner(System.in);
		for (int i=0;i<v.length;i++) {
			System.out.println("Introduzca numero: ");
		    v[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("Los elementos almacenados en el array son: ");
		for (int i=0;i<v.length;i++) {
			System.out.print(v[i]);
			if (i==v.length-1) {
				System.out.println();
			}
			else {
				System.out.print(",");
			}
		}
		

	}

}
