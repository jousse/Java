package herencia;

public class Director extends Gerente {
	private Vehiculo vehiculoEmpresa;
	private int telefonos[] = new int[3];

	public Director(String nombre,int salario,Fecha fechaNacimiento,int comision,String departamento,Vehiculo vehiculoEmpresa,int telefonos[]) {
		super(nombre,salario,fechaNacimiento,comision,departamento);
		this.telefonos=telefonos;
		this.vehiculoEmpresa=vehiculoEmpresa;
	}

	
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		vehiculoEmpresa.mostrarVehiculo();
		mostrarTelefonos();
	}
	
	@Override
	public int getSalario() {
		// TODO Auto-generated method stub
		return (super.getSalario()-super.getComision()+super.getComision()*2);
	}
	
	public void mostrarTelefonos(){
		for(int i=0;i<telefonos.length;i++){
			System.out.println("Agenda Telefono N "+i+" -  "+telefonos[i]);
		}
	}

}
