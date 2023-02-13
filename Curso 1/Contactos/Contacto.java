package Contactos;

public class Contacto {
	private String Nombre;
	private String Apellidos;
	private String Telefono;
	private String Correo;

	public Contacto(String nombre, String apellidos, String telefono, String correo) {
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Correo = correo;
		this.Telefono = telefono;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String toString() {
		return Apellidos +","+ Nombre + "<"+ Correo +">"+"("+ Telefono +")";
	}
	public boolean equals(Object o) {
		boolean res = o instanceof Contacto;
		Contacto c = res ? (Contacto) o : null;
		return res && Nombre.equalsIgnoreCase(c.Nombre)
		&& Apellidos.equalsIgnoreCase(c.Apellidos);
		}
	public int hashCode() {
		return Nombre.toUpperCase().hashCode() +
		Apellidos.toUpperCase().hashCode();
		}
}
