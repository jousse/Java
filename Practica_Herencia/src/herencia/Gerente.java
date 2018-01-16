package herencia;

public class Gerente extends Empleado {
	private int comision;
	private String departamento;

	public Gerente(String nombre,int salario,Fecha fechaNacimiento,int comision,String departamento) {
		super(nombre,salario,fechaNacimiento);
		this.comision=comision;
		this.departamento=departamento;
	}





	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Comision :"+comision+" Departamento : "+departamento);
	}


	// Ligadura dinamica,llamara al metodo dependiendo del objeto que se crea
	@Override
	public int getSalario() {
		// TODO Auto-generated method stub
		return super.getSalario()+comision;
	}
	
	public int getComision(){
		return comision;
	}



	



}
