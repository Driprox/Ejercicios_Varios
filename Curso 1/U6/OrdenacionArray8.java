import java.util.Scanner;

public class OrdenacionArray8 {
		
	public static void main(String[] args) {
		//ejemplo de inicializacion en la declaracion
		int [] v= {4,7,9,1,3,10,14,8,21,2};
	
		
		//el array antes de ordenarse
		System.out.println("Los elementos del array antes de ordenarlos son: ");
		for (int i=0;i<v.length;i++) {
			System.out.print(v[i] +" ");
		}
		System.out.println();
		
		//la parte de ordenar el array usando la implementacion por burbuja
		
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
