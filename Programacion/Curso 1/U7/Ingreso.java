package U7;

public class Ingreso implements Comparable<Ingreso> {
	private Hora horaIngreso;
	private Hora horaAlta;
	private grado grado;
	private String nmedico;
	private String nseguridad;

	public Ingreso() {

	}

	public Ingreso(Hora horaIngreso, Hora horaAlta, U7.grado grado, String nmedico, String nseguridad) {
		this.horaIngreso = horaIngreso;
		this.horaAlta = horaAlta;
		this.grado = grado;
		this.nmedico = nmedico;
		this.nseguridad = nseguridad;
	}

	public Hora getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(Hora horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public Hora getHoraAlta() {
		return horaAlta;
	}

	public void setHoraAlta(Hora horaAlta) {
		this.horaAlta = horaAlta;
	}

	public grado getGrado() {
		return grado;
	}

	public void setGrado(grado grado) {
		this.grado = grado;
	}

	public String getNmedico() {
		return nmedico;
	}

	public void setNmedico(String nmedico) {
		this.nmedico = nmedico;
	}

	public String getNseguridad() {
		return nseguridad;
	}

	public void setNseguridad(String nseguridad) {
		this.nseguridad = nseguridad;
	}

	public boolean equals(Object o) {
		boolean res = o instanceof Ingreso;
		Ingreso in = res ? (Ingreso) o : null;
		return res && horaIngreso.equals(in.horaIngreso) && nseguridad.equals(in.nseguridad);
	}

	public int hashCode() {
		return horaIngreso.hashCode() + nseguridad.hashCode();
	}

	public int compareTo(Ingreso in) {
		int res = horaIngreso.compareTo(in.horaIngreso);
		if (res == 0) {
			res = nseguridad.compareTo(in.nseguridad);
		}
		return res;
	}

	@Override
	public String toString() {
		return horaIngreso + "-" + nseguridad;
	}

}
