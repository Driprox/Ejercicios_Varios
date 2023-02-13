import java.util.Scanner;

public class Busquedas {
	
	//busca un elemento si lo encuentra devuelve true y sino false

	public  static boolean busquedaLinealA(int v[], int dato) {
			int i=0;
			boolean encontrado=false;
			while (i<v.length && !encontrado) { //encontrado==false
				if (v[i]==dato) {
					encontrado=true;
				}
				else {
					i++;
				}
			}
			return encontrado;
		}
	public  static boolean busquedaLinealconFor(int v[], int dato) {
		
		boolean encontrado=false;
		for (int i=0;i<v.length && (encontrado==false); i++) {
			if (v[i]==dato) {
				encontrado=true;
			}
			
		}
		return encontrado;
	}
	//busca el elemento, sino esta devuelve -1
	public  static int busquedaPorPosicion(int v[], int dato) {
		int i=0,pos=-1;
		while (pos==-1 && i<v.length) {
			if (v[i]==dato) {
				pos=i;
			}
			else {
				i++;
			}
		}
		return pos;
	}
	//el mismo que antes pero usando un for
	////busca el elemento,si lo encuentra devuelve su indice y sino esta devuelve -1
	public static int busquedaPorPosicionB(int v[], int dato) {
		int pos=-1;
		for (int i=0; pos==-1 && i<v.length;i++) {
			if (v[i]==dato) {
				pos=i;
			}
			
		}
		return pos;
	}
	//busca el elemento,si esta devuelve su posicion y si no esta devuelve el tamaño del array
	public static int busquedaC(int v[], int dato) {
		    int i=0;
			while (i<v.length && v[i]!=dato) {
			     i++; //++i;
			}
			return i;
		}
	public static int busquedabinaria( int v[], int dato) {
		int  i=0, j=v.length-1,mitad,pos=-1;
		while (i<j && pos==-1) {
			mitad= (i+j)/2;
			if (v[mitad]==dato) //encontrado
				pos=mitad;
			else if (dato < v[mitad]) { //parte izquierda
				j=mitad-1;
			}
			else {   //parte derecha
				i=mitad+1;
			}
		}
		return pos;
		
	}
	public static void main(String[] args) {
		
		int [] v;
		int tama,num,posicion;
		
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
		//vamos a pedir el numero a buscar por teclado
		System.out.print("Introduzca numero a buscar: ");
		num=sc.nextInt();
		
		//cierro Scanner porque ya no voy a usarlo en todo el programa.
		sc.close();
		
		//mostrar el array
		
		//aplicaremos los diferentes algoritmos.
		posicion=busquedaPorPosicion(v,num);
		if (posicion==-1) {
			System.out.println("El " + num +" no se encuentra en el vector/array");
		}
		else {
			System.out.println("El " + num +"  se encuentra en el vector/array en la posicion "+ posicion);
		}
		//terminar
        
}
}
