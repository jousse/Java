package herencia;

public class Empleado {
	private String nombre;
	private int salario;
	private Fecha fechaNacimiento;


	public Empleado(String nombre,int salario,Fecha fechaNacimiento) {
		this.nombre=nombre;
		this.salario=salario;
		this.fechaNacimiento=fechaNacimiento;
	}
	// Metodos Getters y Setters

	public int getSalario() {
		return salario;
	}

	public void mostrarDatos(){
		System.out.println("Nombre: " + nombre+" Sueldo : " + getSalario());
		fechaNacimiento.mostrarFecha();
	}


}
