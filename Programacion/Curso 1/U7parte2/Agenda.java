package U7parte2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agenda {
	private List<Contacto> contactoList;
	private Set<Contacto> contactoSet;

	public Agenda() {
		this.contactoList = new ArrayList<>();
		this.contactoSet = new HashSet<>();
	}

	@Override
	public String toString() {
		return "Agenda [contacto=" + contactoList + "-" + "]";
	}

//Metodos con List
//Agrega y comprueba los contatos
	public void agregarList(Contacto con) {
		if (this.contactoList.contains(con)) {
			System.out.println("El contacto ya existe:");
		} else {
			this.contactoList.add(con);
		}

	}

//Busca un contcto
	public List<Contacto> buscaContactoList(String nombre, String apellido) {
		List<Contacto> resultados = new ArrayList<>();
		for (Contacto c : this.contactoList) {
			if (c.getNombre().equals(nombre) && c.getApellido().equals(apellido)) {
				resultados.add(c);
			}
		}
		return resultados.isEmpty() ? null : resultados;
	}

//Busca y muestra el indice que contenga ese contacto
	public int buscaContactoIndiceList(Contacto con) {
		return this.contactoList.indexOf(con);
	}

//Elimina todo
	public void eliminaList() {
		this.contactoList.clear();
		System.out.println("Se elimino la agenda");
	}

//Escribe y comprueba el fichero
	public void escribirFicheroList(String nombrefichero) {
		File fichero = new File(nombrefichero);
		try {
			if (fichero.exists() == false) {
				fichero.createNewFile();
				System.out.println("Se creo el fichero");
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true));
			bw.write(this.contactoList.toString());
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//Muestra la lista
	public void mostrarList() {
		for (Contacto c : this.contactoList) {
			System.out.println(c);
		}
	}

//Metodos con HashSet
//Agrega el contacto y antes lo comprueba
	public void agregarSet(Contacto con) {
		if (this.contactoSet.contains(con)) {
			System.out.println("El contacto ya existe:");
		} else {
			this.contactoSet.add(con);
		}

	}

//Busca el contacto
	public Set<Contacto> buscaContactoSet(String nombre, String apellido) {
		Set<Contacto> resultados = new HashSet<>();
		for (Contacto c : this.contactoSet) {
			if (c.getNombre().equals(nombre) && c.getApellido().equals(apellido)) {
				resultados.add(c);
			}
		}
		return resultados.isEmpty() ? null : resultados;
	}

//Busca el contacto pero al ser un hasset solo puede decirte si esxiste o no
	public String buscaContactoIndiceSet(Contacto con) {
		for (Contacto c : this.contactoSet)
			if (c.equals(con)) {
				return "El contacto existe";
			}
		return "El contacto no existe";
	}

//Lo elimina todo
	public void eliminaSet() {
		this.contactoSet.clear();
		System.out.println("Se elimino la agenda");
	}

//Comprueba y crea el fichero
	public void escribirFicheroSet(String nombrefichero) {
		File fichero = new File(nombrefichero);

		try {
			if (fichero.exists() == false) {
				fichero.createNewFile();
				System.out.println("Se creo el fichero");
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true));
			bw.write(this.contactoSet.toString());
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//Muestra la coleccion
	public void mostrarSet() {
		for (Contacto c : this.contactoSet) {
			System.out.println(c);
		}
	}

}
