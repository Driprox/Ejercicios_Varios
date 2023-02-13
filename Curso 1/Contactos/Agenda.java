package Contactos;

import java.util.*;

public class Agenda {
	private Contacto[] contacto;

	public Agenda() {
		this.contacto = new Contacto[500];
	}

	public Agenda(int capacidad) {
		this.contacto = new Contacto[capacidad];
	}

	public void buscaContacto(String Nombre, String Apellidos) {
		boolean encontrado = false;
		for (int i = 0; i < contacto.length && !encontrado; i++) {
			if (contacto[i] != null && contacto[i].getNombre().equalsIgnoreCase(Nombre)) {
				encontrado = true;
			}
		}
		for (int i = 0; i < contacto.length && !encontrado; i++) {
			if (contacto[i] != null && contacto[i].getApellidos().equalsIgnoreCase(Apellidos)) {
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.print("Contacto no encontrado");
		}

	}

	public void agregaContacto(Contacto c) {
		boolean encontrado = false;
		for (int i = 0; i < contacto.length && !encontrado; i++) {
			if (contacto[i] == null) {
				contacto[i] = c;
				encontrado = true;
			}
		}
	}

	public void eliminaTodos() {
		contacto = new Contacto[contacto.length];
		System.out.println(contacto[0]);
	}

	public String toString() {
		return Arrays.toString(contacto);
	}

}
