import java.util.Scanner;

public class OrdenacionArray6 {

	public static void main(String[] args) {
		// ejemplo de inicializacion en la declaracion
		int[] v = { 4, 7, 9, 1, 3, 10, 14, 8, 21, 2 };

		// el array antes de ordenarse
		System.out.println("Los elementos del array antes de ordenarlos son: ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();

		// la parte de ordenar el array usando la implementacion por insercion directa
		int p, j;
		int aux;
		for (p = 1; p < v.length; p++) { // desde el segundo elemento hasta
			aux = v[p]; // el final, guardamos el elemento y
			j = p - 1; // empezamos a comprobar con el anterior
			while ((j >= 0) && (aux < v[j])) { // mientras queden posiciones y el
												// valor de aux sea menor que los
				v[j + 1] = v[j]; // de la izquierda, se desplaza a
				j--; // la derecha
			}
			v[j + 1] = aux; // colocamos aux en su sitio
		}

		// el array despues de ordenarse
		System.out.println("Los elementos del array despues de ordenarlos son: ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();

	}

}
