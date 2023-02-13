package U3;
public class CuentaBancaria {
	private long Saldo;
	private String Numero;
	private Cliente Titular;
	public CuentaBancaria(long s,String num,Cliente ti) {
		Saldo=s;
	    Numero=num;
		Titular=ti;
	}
	public String getnumero() {
		return Numero;
	}
	public long getSaldo() {
		return Saldo;
	}
	public Cliente gettitular() {
		return Titular;
	}
	public void setNumero(String num) {
		Numero= num;
		}
	public void setSaldo(long s) {
		Saldo= s;
		}
		public void setTitular(Cliente ti) {
			Titular= ti;}
	public void ingreso (long cantidad) {
		if (cantidad>0) {
			Saldo+=cantidad;
		}
	}
	public void reintegro(long cantidad) {
		if(Saldo>cantidad) {
			Saldo-=cantidad;
		}
	}
      public String dnititular() {
    	  return Titular.getDni();
      }
}