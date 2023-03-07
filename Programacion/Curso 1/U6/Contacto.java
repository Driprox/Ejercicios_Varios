package U6;

public class Contacto {
private String nombre;
private String apellido;
private String correo;
private String numero;

public Contacto(String nombre, String apellido, String correo, String numero) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.correo = correo;
	this.numero = numero;
}
public Contacto() {
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
@Override
public String toString() {
	return apellido + nombre+"<"+ correo+">" +"("+ numero +")"+"-";
}
public boolean equals(Object o) {
boolean res = o instanceof Contacto;
Contacto c = res ? (Contacto) o : null;
return res && nombre.equalsIgnoreCase(c.nombre)
&& apellido.equalsIgnoreCase(c.apellido);
}
public int hashCode() {
return nombre.toUpperCase().hashCode() + 
apellido.toUpperCase().hashCode();
}

}
