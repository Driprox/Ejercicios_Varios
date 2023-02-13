package U3;
public class Cuentabancaria1 {
private int Saldo;
private String Nrocuenta;
private String Titular;
public Cuentabancaria1 (int montoinicial, String num,String nombre) {
	this.Nrocuenta= num;
	this.Saldo= montoinicial;
	this.Titular= nombre;
}
public void depositar(int cantidad) {
	 Saldo+=cantidad;
}
public void retirar(int cantidad) {
	Saldo-=cantidad;
}
public  int obtenerSaldo() {
	return Saldo;
}
}
