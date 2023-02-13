import java.util.Scanner;

//Ejemplo: pide 10 numeros por teclado y los guarda en un array, despues lo muestra por pantalla
public class Ejemplo1_v1 {

	public static void main(String[] args) {
	   int [] v=new int[10];
		
	    Scanner sc = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			System.out.println("Introduzca numero: ");
		    v[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("Los elementos almacenados en el array son: ");
		for (int i=0;i<10;i++) {
			System.out.print(v[i]+" ");
		}
		

	}

}
