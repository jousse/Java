package herencia;

public class Secretario extends Empleado  {
	private int horasExtras;
	private final int COSTEHORA=20;
	
	
	public Secretario(String nombre,int salario,Fecha fechaNacimiento,int horasExtras) {
		super(nombre,salario,fechaNacimiento);
		this.horasExtras=horasExtras;
	}

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Horas Extras : "+horasExtras);
	}

	@Override
	public int getSalario() {
		return super.getSalario()+horasExtras*COSTEHORA;
	}


}
