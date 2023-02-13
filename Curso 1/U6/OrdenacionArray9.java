import java.util.Scanner;
//pide por teclado el tamaño que va a tener el array
//pide por teclado los numeros a leer
//muestra el array antes de ordenarlos
//ordena el array por insercion directa
//muestra el array ordenado
//sin usar subprogramas
public class OrdenacionArray9 {
	
	
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
		for (int i=0;i<v.length;i++) {
			System.out.print(v[i] +" ");
		}
		System.out.println();
		
		//la parte de ordenar el array con el algoritmo de insercion directa
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
		
		//el array despues de ordenarse
		System.out.println("Los elementos del array despues de ordenarlos son: ");
		for (int i=0;i<v.length;i++) {
			System.out.print(v[i] +" ");
		}
		System.out.println();
		
       
	}

}
