package U7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Urgencia implements Serializable {

	private static final long serialVersionUID = 1L;
	private int dia;
	private int mes;
	private List<Ingreso> ingresolista;

	public Urgencia(int dia, int mes, List<Ingreso> ingreso) {
		this.dia = dia;
		this.mes = mes;
		this.ingresolista = ingreso;
	}

	// Agrega un ingreso
	public void agregar(List<Ingreso> ingresos) {
		this.ingresolista.addAll(ingresos);
	}

	// Contara todos los objetos de la lista
	public int atendido() {
		return this.ingresolista.size();
	}

	// Saca los pacientees que tengan el mismo medico
	public List<Ingreso> pacientesPorMedico(String cmedico) {

		for (Ingreso in : this.ingresolista) {
			if (cmedico.equals(in.getNmedico())) {

				return this.ingresolista;
			}
		}
		return null;
	}

	// Ordena todos los ingresos
	public SortedSet<Ingreso> ingresosPorTiempoDeAtencion() {
		SortedSet<Ingreso> ingresosOrdenados = new TreeSet<>((ingreso1, ingreso2) -> {
			int tiempoDeAtencion1 = ingreso1.getHoraIngreso().diferenciaminutos(ingreso1.getHoraAlta());
			int tiempoDeAtencion2 = ingreso2.getHoraIngreso().diferenciaminutos(ingreso2.getHoraAlta());
			return Integer.compare(tiempoDeAtencion1, tiempoDeAtencion2);
		});

		ingresosOrdenados.addAll(this.ingresolista);

		return ingresosOrdenados;
	}

	// Sacara de un archivo los datos para agregarlos a la lista
	public void agregaServicio(String nombreFichero) {
		try {
			BufferedReader bf = new BufferedReader(new FileReader(nombreFichero));
			grado valor = grado.Moderado;
			String linea;
			while ((linea = bf.readLine()) != null) {
				String[] componentes = linea.split(",");
				String[] horaIngreso = componentes[0].split(":");
				int horaI = Integer.parseInt(horaIngreso[0]);
				int minutoI = Integer.parseInt(horaIngreso[1]);
				String[] horaSalida = componentes[4].split(":");
				int horaS = Integer.parseInt(horaSalida[0]);
				int minutoS = Integer.parseInt(horaSalida[1]);

				String numeroSS = componentes[1].trim();
				String codigoMedico = componentes[2].trim();
				int gravedad = Integer.parseInt(componentes[3].trim());
				switch (gravedad) {
				case 0:
					valor = grado.Moderado;
					break;
				case 1:
					valor = grado.Leve;
					break;
				case 2:
					valor = grado.Grave;
				default:
				}
				Ingreso ingreso1 = new Ingreso(new Hora(horaI, minutoI), new Hora(horaS, minutoS), valor, codigoMedico,
						numeroSS);

				this.ingresolista.add(ingreso1);

			}
			bf.close();
		} catch (IOException io) {

		}

	}

	// Creara el fichero
	public void escribefichero(String nombrefichero, Urgencia ur) {
		try {
			File fichero = new File(nombrefichero);
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
			bw.write(ur.toString());
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Urgencia [dia=" + dia + ", mes=" + mes + ", ingreso=" + ingresolista + "]";
	}

}
