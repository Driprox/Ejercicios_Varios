import java.util.Scanner;

public class OrdenacionArray2 {
	// método java de ordenación por selección
	public static void seleccion(int A[]) {
		int i, j, menor, pos, tmp;
		for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
			menor = A[i]; // de los elementos que quedan por ordenar
			pos = i; // y guardamos su posición
			for (j = i + 1; j < A.length; j++) { // buscamos en el resto
				if (A[j] < menor) { // del array algún elemento
					menor = A[j]; // menor que el actual
					pos = j;
				}
			}
			if (pos != i) { // si hay alguno menor se intercambia
				tmp = A[i];
				A[i] = A[pos];
				A[pos] = tmp;
			}
		}
	}

	public static void mostrarArray(int v[]) {
		for (int i=0;i<v.length;i++) {
			System.out.print(v[i] +" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int [] v;
		int tama;
		
		Scanner sc =new Scanner(System.in);
		//vamos a pedir el tamaño del array 
		System.out.print("Introduzca el tamaño del vector: ");
		tama=sc.nextInt();
		sc.close();
		
		v=new int[tama];
		
		//vamos a pedir los numeros por teclado y los guardamos en el array
		for (int i=0;i<v.length;i++) {
			System.out.print("Introduzca numero que se guarda en v[" + i+ "]= ");
			v[i]=sc.nextInt();
		}
		//el array antes de ordenarse
		System.out.println("Los elementos del array antes de ordenarlos son: ");
		mostrarArray(v);
		seleccion(v);
		//el array despues de ordenarse
		System.out.println("Los elementos del array despues de ordenarlos son: ");
		mostrarArray(v);
		
       
	}

}
