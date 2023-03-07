package U7parte2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Agenda agendaList = new Agenda();
		Agenda agendaSet = new Agenda();
		String respuesta,nombre,apellido,numero,correo,nombrefichero,contactobusquedanombre,contactobusquedaapellido ;
		
		//Creamos todos los contactos que queramos
		do {
			System.out.println("Agrega un nombre: ");
			nombre = sc.nextLine();
			System.out.println("Agrega un apellido: ");
			apellido = sc.nextLine();
			System.out.println("Agrega un correo: ");
			correo = sc.nextLine();
			System.out.println("Agrega un numero: ");
			numero = sc.nextLine();
			Contacto contacto = new Contacto(nombre, apellido, correo, numero);
			agendaList.agregarList(contacto);
			agendaSet.agregarSet(contacto);
			System.out.println("Quieres agregar otro(s/n): ");
			respuesta = sc.nextLine();
			sc.nextLine();
		} while (respuesta.equals("s"));
		
		//Pido buscar un contacto y muestro
		System.out.println("Que contacto quieres buscar dime su (nombre,apellido): ");
		contactobusquedanombre = sc.nextLine();
		contactobusquedaapellido = sc.nextLine();
		System.out.println("El contacto es: " + agendaList.buscaContactoList(contactobusquedanombre, contactobusquedaapellido));
		System.out.println("El contacto es: " + agendaSet.buscaContactoSet(contactobusquedanombre, contactobusquedaapellido));
		
		//Pido buscar el indici en los dos objetos
		System.out.println("Vamos a buscar el indice de un contacto dime sus propiedades: ");
		System.out.println("Agrega un nombre: ");
		nombre = sc.nextLine();
		System.out.println("Agrega un apellido: ");
		apellido = sc.nextLine();
		System.out.println("Agrega un correo: ");
		correo = sc.nextLine();
		System.out.println("Agrega un numero: ");
		numero = sc.nextLine();
		Contacto busContacto = new Contacto(nombre, apellido, correo, numero);
		System.out.println("El indice es :" + agendaList.buscaContactoIndiceList(busContacto));
		agendaSet.buscaContactoIndiceSet(busContacto);
		
		//Muestro las listas
		agendaList.mostrarList();
		agendaSet.mostrarSet();
		
		//Solicito el nombre del fichero donde quiero guardarlo
		System.out.println("Dime la dirrecion del archivo para el list: ");
		nombrefichero = sc.nextLine();
		agendaList.escribirFicheroList(nombrefichero);
		System.out.println("Dime la dirrecion del archivo para el set: ");
		nombrefichero = sc.nextLine();
		agendaSet.escribirFicheroSet(nombrefichero);
		
		sc.close();
		
		//Elimino todos los contactos
		agendaList.eliminaList();
		agendaSet.eliminaSet();
	}

}
