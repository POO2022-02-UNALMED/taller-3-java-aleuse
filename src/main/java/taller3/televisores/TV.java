package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	//Constructor
	public TV(Marca marca, boolean estado) {
		this.setMarca(marca);
		this.setEstado(estado);		
	}
	
	//Método get() para el canal
	public int getCanal() {
		return canal;
	}
	
	//Método set() para el canal
	public void setCanal(int canal) {
		if(this.getEstado()) {
			this.canal = canal;
		}
	}
	
	//Método get() para el precio
	public int getPrecio() {
		return precio;
	}
	
	//Método set() para el precio
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//Método get() para el volumen
	public int getVolumen() {
		return volumen;
	}
	
	//Método set() para el volumen
	public void setVolumen(int volumen) {
		if(this.getEstado()) {
			this.volumen = volumen;
		}
	}
	
	//Método get() para el número de televisores
	public static int getNumTV() {
		return numTV;
	}
	
	//Método set() para el número de televisores
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	//Método get() para la marca
	public Marca getMarca() {
		return marca;
	}
	
	//Método set() para la marca
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	//Método get() para el control
	public Control getControl() {
		return control;
	}
		
	//Método set() para el control
	public void setControl(Control control) {
		this.control = control;
	}
	
	//Método get() para el estado
	public boolean getEstado() {
		return estado;
	}
	
	//Método set() para el estado
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	//Método turnOn() para cambiar el estado del TV a encendido
	public void turnOn() {
		this.setEstado(true);
	}
	
	//Método turnOff() para cambiar el estado del TV a apagado
	public void turnOff() {
		this.setEstado(false);
	}
	
	//Método canalUp() para aumentar el canal
	public void canalUp() {
		if(this.getEstado()) {
			if(this.getCanal() >= 1 & this.getCanal() < 120)  {
				this.setCanal(this.getCanal() + 1);
			}
		}
	}
	
	//Método canalDown() para disminuir el canal
	public void canalDown() {
		if(this.getEstado()) {
			if(this.getCanal() > 1 & this.getCanal() <= 120)  {
				this.setCanal(this.getCanal() - 1);
			}
		}
	}
	
	//Método volumenUp() para aumentar el volumen
	public void volumenUp() {
		if(this.getEstado()) {
			if(this.getVolumen() >= 0 & this.getVolumen() < 7)  {
				this.setVolumen(this.getVolumen() + 1);
			}
		}
	}
	
	//Método volumenDown() para disminuir el volumen
	public void volumenDown() {
		if(this.getEstado()) {
			if(this.getVolumen() > 0 & this.getVolumen() <= 7)  {
				this.setVolumen(this.getVolumen() - 1);
			}
		}
	}
}
