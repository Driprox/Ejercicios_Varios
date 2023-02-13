package Contactos;

import java.io.*;
import java.util.*;

public class Agenda2hash {
	private SortedSet<Contacto>contactos;

	public Agenda2hash() {
		contactos = new TreeSet<>();;
	}

	public Contacto buscaContacto(String nombre, String apellidos) {
			for (Contacto c : contactos) {
				if (c.getNombre().equals(nombre)&&c.getApellidos().equals(apellidos)) {
					return c;
				}
			}
			return null;
		}
	public int buscaContacto(Contacto cont) {
		int i = 0;
		for (Contacto c : contactos) {
			if (c.equals(cont)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public void agregaContacto(Contacto c) {
		contactos.add(c);
	}

	public void eliminaTodos() {
		contactos.clear();
		}
	

	public String toString() {
		String resu="";
		for (Contacto c : contactos) {
		   resu +=c;
		   resu +='-'; 
		}
		return resu;
	}
	public void escribeEnElfichero(String nombreFichero) throws FileNotFoundException {
		PrintWriter cw = new PrintWriter(nombreFichero);
		for (Contacto c : contactos) {
			cw.println(c);
		}
		cw.close();
	}
}
