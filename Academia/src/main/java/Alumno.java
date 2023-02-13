import java.io.Serializable;

import jakarta.persistence.*;
//Las librerias que hay que agregar son de jakarta.persistence para que guarde bien la entidad
@Entity
@Table(name = "alumno")//Aqui llamo a la clase entidad y la relaciono con la tabla alumno en la BBDD
public class Alumno implements Serializable {

	private static final long serialVersionUID = 1L;//Hay que añadirlo para que funcione la implementacion de Serializable

	@Id
	@Column(name = "id")//Relaciono la columna id y le digo que es la clave principal
	private int id;

	@Column(name = "nombre")//Relaciono todas las columnas aunque no sea necesario,pero quiero que sea mas correcto
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "edad")
	private int edad;

	@Column(name = "nasignaturas")
	private int asignatura;

	@Column(name = "curso")
	private String curso;

	//Creo dos constructores uno vacio y otro al que le agrgegare las siguentes propiedas menos la id que se agregara sola y se incrementara.
	public Alumno() {

	}

	public Alumno(String nombre, String apellido, String curso, int edad, int asignatura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.asignatura = asignatura;
		this.curso = curso;
	}

	//Creo todos los metodos getter y setter de las propiedades
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(int asisgnatura) {
		this.asignatura = asisgnatura;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	//Agrego el toString para que cuando liste  la base quede mejor
	@Override
	public String toString() {
		return "Alumno: id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", asignatura="
				+ asignatura + ", curso=" + curso + "";
	}

}
