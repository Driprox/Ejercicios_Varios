import java.util.Scanner;

public class Busqueda2 {

	// busca un elemento si lo encuentra devuelve true y sino false

	public static void main(String[] args) {

		int[] v;
		int tama, num, posicion;

		Scanner sc = new Scanner(System.in);
		// vamos a pedir el tamaño del array
		System.out.print("Introduzca el tamaño del vector: ");
		tama = sc.nextInt();

		v = new int[tama];

		// vamos a pedir los numeros por teclado y los guardamos en el array
		for (int i = 0; i < v.length; i++) {
			System.out.print("Introduzca numero que se guarda en v[" + i + "]= ");
			v[i] = sc.nextInt();
		}
		
		// mostrar el array
		for (int i = 0; i < v.length; i++) {
			System.out.println("v[" + i + "]= " + v[i]);
		}
		
		// vamos a pedir el numero a buscar por teclado
		System.out.print("Introduzca numero a buscar: ");
		num = sc.nextInt();

		// cierro Scanner porque ya no voy a usarlo en todo el programa.
		sc.close();

		// procedemos a buscar el elemento
		int i = 0;
		boolean encontrado = false;
		while (i < v.length && !encontrado) { // encontrado==false
			if (v[i] == num) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) { // encontrado==true
			System.out.println("El " + num + "  se encuentra en el vector/array");
		} else {
			System.out.println("El " + num + "  no se encuentra en el vector/array en la posicion ");
		}
		// terminar

	}
}
