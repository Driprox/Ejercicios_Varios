package Contactos;

import java.util.*;

public class MainAgenda1 {
	public static void main(String[] args) {
		String n,a;
		Contacto[] contactos = {
		new Contacto("Pepe","Montes","jmontes@gmail.com","111222333"),
		new Contacto("Jose","Llanos","jllanos@hotmail.com","666777888"),
		new Contacto("Fefi","Ríos","mjrios@gmail.com","333444555"),
		new Contacto("Pepi","Colinas","jcolinas@uma.es","222333444")
		};
		Scanner sc= new Scanner(System.in);
		Agenda1 agenda = new Agenda1();
		for (Contacto c : contactos)
			agenda.agregaContacto(c);
		System.out.println(agenda);		
System.out.println("Introduce el nombre a buscar ");
                 n=sc.next();
System.out.println("Introduce el apellido a buscar ");
    a=sc.next();
	 System.out.println(agenda.buscaContacto(n,a));
	    agenda.eliminaTodos();
		System.out.println("La agenda debe estar vacía: \n\t" + agenda);
		sc.close();
		}
}
