package U6;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

	public static void main(String[] args) {
		int i;
		int e;
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce el array: ");
         i=sc.nextInt();
		System.out.println("Introduce el destino: ");
        e=sc.nextInt();
        sc.close();
        int arry[] = {i};
		int key = e;
		int result = Arrays.binarySearch(arry, key);
		if (result < 0)
			System.out.println("El elemento no existe ");
		else
			System.out.println("El elemento existe: " + result);
	}
}
