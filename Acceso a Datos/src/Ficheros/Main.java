package Ficheros;

import java.util.Scanner;//C:\Users\FP\Desktop\prueba.txt

public class Main {

	public static void main(String[] args) {
		Fichero fichero1 = new Fichero();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el nombre de fichero que quieres leer: ");
		String nombreFichero = sc.nextLine();
		fichero1.escritura(nombreFichero);
		fichero1.leerfichero(nombreFichero);
		fichero1.ficheroestadistica(nombreFichero);

		sc.close();
	}

}
