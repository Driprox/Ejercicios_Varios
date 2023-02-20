import java.time.LocalDateTime;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DAO {

	protected SessionFactory sessionfactory;// Nombro las propiedades y el scanner que usare en clase
	Scanner sc = new Scanner(System.in);

	protected void Conectar() {// Comenzara la conexion con la base de datos
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		try {
			sessionfactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			System.out.println("----------------Sesion iniciada-----------------");
		} catch (Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}

	}

	protected void Salir() {// Finalizara la conexion con la base de datos
		sessionfactory.close();
		System.out.println("------------Sesion cerrada------------");
	}

	// Guardara cada entrada que introduzacamos y su comentario tantas veces como
	// queramos con el bucle do while que hara las preguntas tanto de la entrad como
	// el comentario
	protected void guardar() {
		String pregunta;
		do {
			String comenta, titulo, contenido, enlace, email;
			boolean aprobado;
			LocalDateTime fecha = LocalDateTime.now();// Es la clase que me guardar el tiempo y la fecha de cada entrada
			Session sesion = sessionfactory.openSession();

			sesion.beginTransaction();

			System.out.println("---------Introducir Entrada----------");
			System.out.println("Introduzca el titulo: ");
			titulo = sc.nextLine();
			System.out.println("Introduzca el contenido: ");
			contenido = sc.nextLine();
			System.out.println("Introduzca el enlace: ");
			enlace = sc.nextLine();

			Entrada entrada = new Entrada(titulo, contenido, enlace, fecha);
			sesion.persist(entrada);

			do {

				System.out.println("---------Introducir Comentario----------");
				System.out.println("Introduzca el email: ");
				email = sc.nextLine();
				System.out.println("Introduzca el comentario: ");
				comenta = sc.nextLine();
				System.out.println("Es valido true/false: ");
				aprobado = sc.nextBoolean();
				sc.nextLine();

				Comentario comentario = new Comentario(email, comenta, entrada, aprobado);
				sesion.persist(comentario);

				System.out.println("Quieres volver a introducir otro comentario s/n: ");
				pregunta = sc.nextLine();

			} while (pregunta.equals("s"));

			sesion.getTransaction().commit();

			sesion.close();

			System.out.println("------------Entrada Guardada--------------");

			System.out.println("Quieres repetir s/n: ");
			pregunta = sc.nextLine();

		} while (pregunta.equals("s"));
	}

	// Cargara la entrada con sus comentarios correspondientes haciendo uso de
	// consulta hql con el parametro de enlace que introducimos
	protected void cargar(String enlace) {
		Session sesion = sessionfactory.openSession();

		@SuppressWarnings({ "deprecation", "unchecked" })
		List<Entrada> entrada = sesion.createQuery("FROM Entrada en WHERE en.Enlace = : enlace")
				.setParameter("enlace", enlace).getResultList();

		for (Entrada en : entrada) {
			System.out.println(
					"---------------Dato--------------" + "\nEntrada: " + en.toString() + "\n" + en.getComentarios());
		}

		sesion.close();

	}

	// Mostrar una lista con los ultimas entradas junto a sus comentarios gracias a
	// la consulta hql y que esta ordenada por la fecha
	protected void portada(int cantidad) {
		Session sesion = sessionfactory.openSession();

		// Hay que señalar la entidad y no la columna en la tabla Mysql,hay que
		// agregarle distinct al select para que marque mas de dos entradas
		@SuppressWarnings({ "deprecation", "unchecked" })
		List<Entrada> entrada = sesion.createQuery(
				"SELECT DISTINCT Entrada FROM Entrada en JOIN Comentario com WHERE en.Id = com.Entrada AND com.Aprobado = true ORDER BY en.Fecha DESC")
				.setFirstResult(0).setMaxResults(cantidad).getResultList();

		for (Entrada en : entrada) {

			System.out.println("---------------Datos------------------" + "\nEntrada: " + en.toString() + "\n"
					+ "Comentarios: " + en.getComentarios() + "\n");

		}

		sesion.close();

	}

}
