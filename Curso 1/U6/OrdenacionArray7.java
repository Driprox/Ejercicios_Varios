import java.util.Scanner;

public class OrdenacionArray7 {
	// método java de ordenación burbuja (BubleSort)
	public static void burbuja(int[] v) {
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
		
		
		v=new int[tama];
		
		//vamos a pedir los numeros por teclado y los guardamos en el array
		for (int i=0;i<v.length;i++) {
			System.out.print("Introduzca numero que se guarda en v[" + i+ "]= ");
			v[i]=sc.nextInt();
		}
		sc.close();
		//el array antes de ordenarse
		System.out.println("Los elementos del array antes de ordenarlos son: ");
		mostrarArray(v);
		burbuja(v);
		//el array despues de ordenarse
		System.out.println("Los elementos del array despues de ordenarlos son: ");
		mostrarArray(v);
		
       
	}
	

}
