package taller3.televisores;

public class Marca {
	private String nombre;
	
	//Constructor 
	public Marca(String nombre) {
		this.setNombre(nombre);
	}
	
	//Método get()
	public String getNombre() {
		return nombre;
	}
	
	//Método set()
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
