package Contactos;
import java.io.*;
import java.util.*;

public class Agenda1 {

		private List<Contacto>contactos;

		public Agenda1() {
			contactos=new ArrayList<Contacto>();
		}

		public Contacto buscaContacto(String nombre, String apellidos) {
				for (Contacto c : contactos) {
					if (c.getNombre().equals(nombre)&&c.getApellidos().equals(apellidos)) {
						return c;
					}
				}
				return null;
			}
		public int buscarBusca(Contacto cont) {
			int indice = -1;
			for (int i = 0; i < contactos.size() && (indice == -1); i++) {
				Contacto c = contactos.get(i);
				if (c.equals(cont)) {
					indice = i;
				}
			}
			return indice;
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
		public void presentaFichero(String nombreFichero) throws FileNotFoundException {
			PrintWriter cw = new PrintWriter(nombreFichero);
			
			for (Contacto c:contactos) {
				  cw.println(c);
			}
			cw.close();
		}
	}


