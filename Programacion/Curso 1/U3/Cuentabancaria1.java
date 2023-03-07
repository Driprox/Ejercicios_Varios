package U3;
public class Cuentabancaria1 {
private int Saldo;
private String Nrocuenta;
private String Titular;
public String getTitular() {
	return Titular;
}
public void setTitular(String titular) {
	Titular = titular;
}
public int getSaldo() {
	return Saldo;
}
public void setSaldo(int saldo) {
	Saldo = saldo;
}
public String getNrocuenta() {
	return Nrocuenta;
}
public void setNrocuenta(String nrocuenta) {
	Nrocuenta = nrocuenta;
}
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
