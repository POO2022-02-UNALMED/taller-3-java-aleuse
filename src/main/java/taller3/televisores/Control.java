package taller3.televisores;

public class Control {
	private TV tv;
	
	//Método get() para el tv asociado al control
	public TV getTv() {
		return tv;
	}
	
	//Método set() para el tv asociado al control
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	//Método para enlazar el control con el televisor y viceversa
	public void enlazar(TV tv) {
		this.setTv(tv);
		tv.setControl(this);
	}
	
	//Método para encender el televisor desde el control
	public void turnOn() {
		tv.turnOn();
	}
	
	//Método para apagar el televisor desde el control
	public void turnOff() {
		tv.turnOff();
	}
	
	//Método para aumentar el canal desde el control
	public void canalUp() {
		tv.canalUp();
	}
	
	//Método para disminuir el canal desde el control
	public void canalDown() {
		tv.canalDown();
	}
	
	//Método para aumentar el volumen desde el control
	public void volumenUp() {
		tv.volumenUp();
	}
	
	//Método para disminuir el volumen desde el control
	public void volumenDown() {
		tv.volumenDown();
	}
	
	//Método para asignar el canal desde el control
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
}
