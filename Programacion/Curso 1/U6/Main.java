package U6;

public class Main {

	public static void main(String[] args) {
		// Creamos un array con contactos
		Contacto[] contactos = { new Contacto("Pepe", "Montes", "jmontes@gmail.com", "111222333"),
				new Contacto("Jose", "Llanos", "jllanos@hotmail.com", "666777888"),
				new Contacto("Fefi", "Ríos", "mjrios@gmail.com", "333444555"),
				new Contacto("Pepi", "Colinas", "jcolinas@uma.es", "222333444") };
		// Creamos un contacto
		Contacto contacto = new Contacto("Pepito", "Arroyo", "ja@gmail.com", "444555666");
		// Añadimos a una agenda los cuatro contactos del array anterior
		Agenda agenda = new Agenda(0, 100, contactos);
		for (Contacto c : contactos)
			agenda.agregaContacto(c);

		// Agregamos contacto ya existente (aunque con diferente email)
		// No debería añadirse
		agenda.agregaContacto(new Contacto("Pepe", "Montes", "pepe.montes@hotmail.com", "111222333"));
		// Agregamos un contacto que no está en la agenda. Debería añadirse
		agenda.agregaContacto(contacto);
		System.out.println(agenda.toString());

		// Imprimimos el número de contactos con correo electrónico en gmail.com:
		System.out.println("El número de contactos con dirección en gmail.com es: " + agenda.buscaemail("gmail.com"));
		agenda.eliminacontactos();
		System.out.println("La cantidad que hay es de: " + agenda.toString());
	}

}
