import java.util.Scanner;
//El mismo ejercicio que el anterior , cambia que ahora los datos del array no los pido de teclado
//sino que se inicializa en su declaracion.
public class OrdenacionArray1 {
		
	public static void main(String[] args) {
		//ejemplo de inicializacion en la declaracion
		int [] v= {4,7,9,1,3,10,14,8,21,2};
	
		
		//el array antes de ordenarse
		System.out.println("Los elementos del array antes de ordenarlos son: ");
		for (int i=0;i<v.length;i++) {
			System.out.print(v[i] +" ");
		}
		System.out.println();
		
		//la parte de ordenar el array por seleccion
		int i, j, menor, pos, tmp;
		for (i = 0; i < v.length - 1; i++) { // tomamos como menor el primero
			menor = v[i]; // de los elementos que quedan por ordenar
			pos = i; // y guardamos su posición
			for (j = i + 1; j < v.length; j++) { // buscamos en el resto
				if (v[j] < menor) { // del array algún elemento
					menor = v[j]; // menor que el actual
					pos = j;
				}
			}
			if (pos != i) { // si hay alguno menor se intercambia
				tmp = v[i];
				v[i] = v[pos];
				v[pos] = tmp;
			}
		}
		
		//el array despues de ordenarse
		System.out.println("Los elementos del array despues de ordenarlos son: ");
		for (i=0;i<v.length;i++) {
			System.out.print(v[i] +" ");
		}
		System.out.println();
		
       
	}

}
