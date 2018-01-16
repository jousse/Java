package herencia;

public class Principal {

	public static void main(String[] args) {
		
		// Creacion de Objetos
		Fecha f1=new Fecha(1,1,1996);
		Fecha f2=new Fecha(3,5,2011);
		Vehiculo v1=new Vehiculo("Ford","3008",f2);
		int telefonos[] = {111,222,333,444,555};
		
		Empleado e1=new Empleado("Alfredo",1250,f1);
		Secretario s1=new Secretario("Paco",1250,null,5);
		Gerente g1=new Gerente("Pedro",1350,f1,150,"Ventas");
		Director d1=new Director("Jouse",1350,f1,150,"Direccion",  v1,telefonos);
		//Invocacion de métodos
		System.out.println("Categoria : " + Empleado.class.getName().substring(9));
		e1.mostrarDatos();
		System.out.println("Categoria : " + Gerente.class.getName().substring(9));
		g1.mostrarDatos();
		System.out.println("Categoria : " + Director.class.getName().substring(9));
		d1.mostrarDatos();
		
		/*
		System.out.println("Categoria : " + Secretario.class.getName().substring(9));
		s1.mostrarDatos();
		
		
		f1.mostrarFecha();
		*/
		
	}

}
