
public class Vehiculo {  //NOMBRE DE LA CLASE ES Vehiculo
	
	//atributos (son variables u objetos)
	private String matricula; //matricula es un objeto 
	private String modelo;    //modelo es un objeto
	private int potenciaCV;  //potenciaCV es una variable
	
	//METODOS: CONTRUCTOR,DECTRUCTOR,OTROS METODOS
	
	//constructor con tres argumentos
	public Vehiculo(String ma,String mod,int pot) {
		matricula=ma;
		modelo=mod;
		potenciaCV=pot;
	}
    //constructor que no le paso nada , sin argumentos
	public Vehiculo() {
		
		this("","",0); //matricula=""; modelo=""; potenciaCV=0;
	}
	
	//metodos consulta: son los que nos devuelven el contenido de los atributos
	public String getMatricula() {
		return matricula;
	}
	public String getModelo() {
		return modelo;
	}

	public int getPotenciaCV() {
		return potenciaCV;
	}

	//metodos de modificación : son los que lo modificación los atributos
	public void setMatricula(String mat) {
		matricula=mat;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}

	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", potenciaCV=" + potenciaCV + "]";
	}
	
}

