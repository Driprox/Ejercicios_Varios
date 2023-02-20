import java.util.Scanner;

public class ClasePrincipal {

	//La clase que inicia el programa en general
	public static void main(String[] args) {
		DAO nuevo = new DAO();
		Scanner sc = new Scanner(System.in);
		nuevo.Conectar();
		nuevo.guardar();
		//Aqui le pido al usuario por pantalla que introduzca el enlace a buscar y el numero de entradas requeridas
		System.out.println("--------------Busqueda enlace--------------");
		System.out.println("Dime que enlace quieres buscar: ");
		String enlace = sc.nextLine();
		nuevo.cargar(enlace);
		System.out.println("--------------Cantidad de lista--------------");
		System.out.println("Dime que cantida quieres sacar de entradas: ");
		int numero = sc.nextInt();
		nuevo.portada(numero);
		sc.close();
		nuevo.Salir();
	}

}
