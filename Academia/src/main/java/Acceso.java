import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

//Aqui estan las librerias usadas todas pertenecen a org.hibernate

public class Acceso {

	protected SessionFactory sessionFactory;// Aqui llamo a la SessionFactory que usare en todos los metodos:

	// Metodos

	protected void conectar() {// Este metodo iniciara la sesionFactory en la clase principal y conectara con la BBDD de mysql

		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")// Aqui indico que archivo de configuracion
	    .build();																						           // tiene que iniciar para conectar																													
				
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			System.out.println("Sesion iniciada");
		} catch (Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	protected void salir() {// Este metodo cerrara el sesionFactory en la clase principal
		sessionFactory.close();
		System.out.println("Sesion finalizada");
	}

	protected String insertarAlumno(Alumno alum) {// Este metodo insertara un alumno agregando directamente el alumno creado

		Session sesion1 = sessionFactory.openSession();// Inicia una sesion en el metodo

		try {
			sesion1.beginTransaction();// Comienza la transacion

			sesion1.persist(alum);// Guarda el alumno creado
			sesion1.getTransaction().commit();// Realiza un commit en la BBDD
			sesion1.close();// Cierra sesion en el metodo
			System.out.println("---------Alumno dado de Alta-------");
			return "Usuario Creado";

		} catch (Exception e) {
			e.printStackTrace();// He creado un try y cath por si diera un error a la hora de la insercion del alumno										}
		return "Error en el registro";
	}
		}

	@SuppressWarnings("unchecked")
	protected void listarAlumno() {// Aqui listo el alumno haciendo uso de HQL
		Session sesion1 = sessionFactory.openSession();
		@SuppressWarnings("deprecation")
		List<Alumno> listaalumnos = (List<Alumno>) sesion1.createQuery("FROM Alumno").list();//El metodo createQuerry esta endesuso segun hibernate6.1
																								//y por eso he tenido que agregar un Warning deprecated																							 																								
		System.out.println("-----------------------Lista de Alumnos----------------");

		for (Alumno alumno : listaalumnos) {// Hare uso de la lista para mostrar todo el contenido de la tabla																						
			System.out.println(alumno.toString());
			sesion1.close();
		}

	}
}
