
import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "comentario")
public class Comentario implements Serializable {

	private static final long serialVersionUID = 1L;

	// Aqui estan las propieddes enlazadas con las columnas de la BBDD
	@Id
	@Column(name = "id_comen")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "email")
	private String Email;

	@Column(name = "aprobado")
	private boolean Aprobado;

	@Column(name = "comentario")
	private String Comentario;

	// Aqui indico la relacion m:1 que mantiene con entrada y le indico la columna
	// en la BBDD
	@ManyToOne
	@JoinColumn(name = "id_entr")
	private Entrada Entrada;

	// Contructor vacio y completo menos el id
	public Comentario() {
	}

	public Comentario(String email, String comentario, Entrada entrada, boolean aprobado) {
		Email = email;
		Aprobado = aprobado;
		Comentario = comentario;
		Entrada = entrada;
	}

	// Getter y Setter de la clase y el toString
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public boolean isAprobado() {
		return Aprobado;
	}

	public void setAprobado(boolean aprobado) {
		Aprobado = aprobado;
	}

	public String getComentario() {
		return Comentario;
	}

	public void setComentario(String comentario) {
		Comentario = comentario;
	}

	public Entrada getEntrada() {
		return Entrada;
	}

	public void setEntrada(Entrada entrada) {
		Entrada = entrada;
	}

	@Override
	public String toString() {
		return "Comentario: [id=" + id + ", Email=" + Email + ", Aprobado=" + Aprobado + ", Comentario=" + Comentario+"]";
	}

}
