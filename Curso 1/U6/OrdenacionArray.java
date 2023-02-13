package U6;

import java.util.Arrays;

public class OrdenacionArray {

	public static void main(String[] args) {

		final int TAM = 10;
		int lista[] = new int[TAM];
		rellenarArray(lista);

		String lista_int[] = { "1", "2", "3", "4", "5" };

		System.out.println("Array de números sin ordenar:");
		imprimirArray(lista);

		Arrays.sort(lista);

		System.out.println("Array de números ordenado:");
		imprimirArray(lista);

		System.out.println("Array de int sin ordenar:");
		imprimirArray(lista_int);

		Arrays.sort(lista_int);

		System.out.println("Array de int ordenado:");
		imprimirArray(lista_int);
	}

	public static void imprimirArray(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	public static void imprimirArray(String lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	public static void rellenarArray(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = numeroAleatorio();
		}
	}

	private static int numeroAleatorio() {
		return ((int) Math.floor(Math.random() * 1000));
	}
}