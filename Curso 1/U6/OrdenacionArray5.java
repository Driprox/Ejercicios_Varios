import java.util.Scanner;
//pide por teclado el tamaño que va a tener el array
//pide por teclado los numeros a leer
//muestra el array antes de ordenarlos
//ordena el array aplicando el metodo de burbuja (bubleSort)
//muestra el array ordenado
//sin usar subprogramas
public class OrdenacionArray5 {
	
	
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
		
		//la parte de ordenar el array
		int i, j, aux;
        for (i = 0; i < v.length - 1; i++) {
            for (j = 0; j < v.length - i - 1; j++) {                                                              
                if (v[j + 1] < v[j]) {
                    aux = v[j + 1];
                    v[j + 1] = v[j];
                    v[j] = aux;
                }
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
