package herencia;

public class Vehiculo {

	private String marca;
	private String modelo;
	private Fecha fechaM;

	public Vehiculo(String marca, String modelo, Fecha fechaM) {
		this.marca = marca;
		this.modelo = modelo;
		this.fechaM = fechaM;
	}
	public void mostrarVehiculo(){
		System.out.println(" Marca PALOTE GORDO: " + marca + " Modelo : "+modelo);
		fechaM.mostrarFecha();
	}
	
}
