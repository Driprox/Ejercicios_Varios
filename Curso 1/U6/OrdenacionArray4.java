import java.util.Scanner;

public class OrdenacionArray4 {
	// método java de ordenación insercion
	public static void insercionDirecta(int A[]) {
		int p, j;
		int aux;
		for (p = 1; p < A.length; p++) { // desde el segundo elemento hasta
			aux = A[p]; // el final, guardamos el elemento y
			j = p - 1; // empezamos a comprobar con el anterior
			while ((j >= 0) && (aux < A[j])) { // mientras queden posiciones y el
											// valor de aux sea menor que los
				A[j + 1] = A[j]; // de la izquierda, se desplaza a
				j--; // la derecha
			}
			A[j + 1] = aux; // colocamos aux en su sitio
		}
	}

	public static void mostrarArray(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] v;
		int tama;

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
		sc.close();
		// el array antes de ordenarse
		System.out.println("Los elementos del array antes de ordenarlos son: ");
		mostrarArray(v);
		insercionDirecta(v);
		// el array despues de ordenarse
		System.out.println("Los elementos del array despues de ordenarlos son: ");
		mostrarArray(v);

	}

}
