package U7;

public class Hora implements Comparable<Hora> {
	private int hora;
	private int minuto;

	public Hora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}
	}

	public boolean equals(Object o) {
		boolean res = o instanceof Hora;
		Hora h = res ? (Hora) o : null;
		return res && hora == h.hora && minuto == h.minuto;
	}

	public int hashCode() {
		return hora + minuto;
	}

	public int compareTo(Hora h) {
		int res = Integer.compare(hora, h.hora);
		if (res == 0) {
			res = Integer.compare(minuto, h.minuto);
		}
		return res;
	}

	//Me dira las diferencias entre minutos y horas
	public int diferenciaminutos(Hora h) {
		int minutos = minuto - h.minuto;
		int horas = hora - h.hora;
		int minutoshoras = horas * 60;
		int resultado = minutoshoras + minutos;
		if (resultado < 0) {
			resultado = (Math.abs(resultado));
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "[" + hora + ":" + minuto + "]";
	}

}
