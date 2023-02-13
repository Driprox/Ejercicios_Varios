import java.util.Scanner;

//Ejemplo: declarar un array de 10 numeros enteros y se guardan automaticamente con ceros. 
public class Ejemplo1 {

	public static void main(String[] args) {
		int [] v=new int[10];
		
	
		System.out.println("Los elementos almacenados en el array son: ");
		for (int i=0;i<v.length;i++) { //i<10
			System.out.print(v[i]+" ");
		}
		

	}

}
