package U3;
public class Cliente {
		private String Nombre;
		private String Apellidos;
		private String Dni;
		public Cliente(String n,String ap,String d) {
		Nombre=n;
	    Apellidos=ap;
		Dni=d;
		}
		public String getNombre() {
			return Nombre;
		}
		public String getApellidos() {
			return Apellidos;
		}
		public String getDni() {
			return Dni;
		}
		public void setNombre(String n) {
			Nombre= n;
		}
		public void setDni(String d) {
			Dni= d;
		}
		public void setApellidos(String ap) {
			Apellidos= ap;
		}
		public String nombrecompleto() {
			return Nombre+""+Apellidos+""+Dni;
		}
}