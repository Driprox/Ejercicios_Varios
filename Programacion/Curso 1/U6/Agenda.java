package U6;

public class Agenda {
	private int cantidadContacto;
	private int cantidadMaxima;
	private Contacto contactos[];

	// Contructor y Metodos
	public Agenda() {

	}

	public Agenda(int cantidadContacto, int cantidadMaxima, Contacto[] contactos) {
		this.cantidadContacto = 0;
		this.cantidadMaxima = 500;
		this.contactos = new Contacto[cantidadMaxima];
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	public Contacto[] getContactos() {
		return contactos;
	}

	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}

	public int getCantidadContacto() {
		return cantidadContacto;
	}

	public void setCantidadContacto(int cantidadContacto) {
		this.cantidadContacto = cantidadContacto;
	}

	// Busca los contactos por el nombre y el apellido
	public Contacto buscaContacto(String nombre, String apellido) {
		for (int i = 0; i < cantidadContacto; i++) {
			String nombreContacto = contactos[i].getNombre();
			String apellidoContacto = contactos[i].getApellido();
			if (nombreContacto.equalsIgnoreCase(nombre) && apellidoContacto.equalsIgnoreCase(apellido)) {
				return contactos[i];
			}
		}
		return null;
	}

	// Agrega los contactos y los comprueba si existen
	public void agregaContacto(Contacto c) {
		for (int i = 0; i < cantidadContacto; i++) {
			if (contactos[i].equals(c)) {
				System.out.println("Ya existe el contacto");
			}

		}
		if (cantidadContacto < cantidadMaxima) {
			contactos[cantidadContacto] = c;
			cantidadContacto++;
		} else {
			System.out.println("No se puede agregar el contacto, la agenda está llena.");
		}

	}

	// Busca por el email
	public int buscaemail(String email) {
		int numerocontactos = 0;
		for (int i = 0; i < cantidadContacto; i++) {
			String emailcontacto = contactos[i].getCorreo();
			if (emailcontacto.endsWith("@" + email)) {
				numerocontactos++;
			}

		}
		return numerocontactos;
	}

	// Elimina todo el array
	public void eliminacontactos() {
		for (int i = 0; i < cantidadContacto; i++) {
			contactos[i] = null;
		}
		cantidadContacto = 0;
		System.out.println("Lista borrada");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cantidadContacto; i++) {
			if (contactos[i] != null) {
				sb.append(contactos[i]).append("\n");
			}
		}
		return sb.toString();
	}

}
