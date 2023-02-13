import java.util.Scanner;

//Crea un array numérico con 5 elementos. Los números de cada elemento deben 
//ser valores pedidos por teclado al usuario. Muestra por consola el índice y el valor al que corresponde. Debes utiliza bucles tanto para pedir los valores de los elementos del array como para mostrar su contenido por pantalla
public class Ejercicio1_Ejemplo_VideoConfernencia {

	public static void main(String[] args) {
	   int [] v=new int[5];
		
	    Scanner sc = new Scanner(System.in);
		for (int i=0;i<v.length;i++) {
			System.out.println("Introduzca numero: ");
		    v[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("Los elementos almacenados en el array son: ");
		for (int i=0;i<v.length;i++) {
			System.out.print("v[" + i + "]="+v[i]+" ");
		}
		

	}

}
