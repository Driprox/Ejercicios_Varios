import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "entrada")
public class Entrada implements Serializable {

	private static final long serialVersionUID = 1L;

	// Propiedaades enlazadas con las columnas de la BBDD
	@Id
	@Column(name = "id_entr")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "titulo")
	private String Titulo;

	@Column(name = "enlace")
	private String Enlace;

	@Column(name = "contenido")
	private String Contenido;

	@Column(name = "fecha")
	private LocalDateTime Fecha;

	// Aqui indico la relacion que mantiene con comentatio que es 1:m y la mapeo con
	// la propiedad de comentario para relacionarlos,esta clase la he creado para
	// dicha relacion
	@OneToMany(mappedBy = "Entrada")
	private List<Comentario> comentarios = new ArrayList<>();

	// Los contructores vacio y el relleno menos con el id que es autoincrementado
	public Entrada() {

	}

	public Entrada(String titulo, String contenido, String enlace, LocalDateTime fecha) {

		Titulo = titulo;
		Enlace = enlace;
		Contenido = contenido;
		Fecha = fecha;
	}

	// Getter y Setter de la clase y el toString
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getEnlace() {
		return Enlace;
	}

	public void setEnlace(String enlace) {
		Enlace = enlace;
	}

	public String getContenido() {
		return Contenido;
	}

	public void setContenido(String contenido) {
		Contenido = contenido;
	}

	public LocalDateTime getFecha() {
		return Fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		Fecha = fecha;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Entrada: [id=" + id + ", Titulo=" + Titulo + ", Enlace=" + Enlace + ", Contenido=" + Contenido
				+ ", Fecha=" + Fecha+"]";
	}

}
