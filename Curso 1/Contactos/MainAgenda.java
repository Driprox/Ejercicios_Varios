package Contactos;
public class MainAgenda{
public static void main(String[] args) {
Contacto[] contactos = {
new Contacto("Pepe","Montes","jmontes@gmail.com","111222333"),
new Contacto("Jose","Llanos","jllanos@hotmail.com","666777888"),
new Contacto("Fefi","Ríos","mjrios@gmail.com","333444555"),
new Contacto("Pepi","Colinas","jcolinas@uma.es","222333444")
};
Agenda1 agenda= new Agenda1();
System.out .println("La agenda debe incluir cinco contactos: \n\t" + agenda);
}
}