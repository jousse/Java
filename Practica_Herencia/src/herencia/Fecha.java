package herencia;

public class Fecha {
	 private int dia;
	 private int mes;
	 private int anno;
	
	
	public Fecha(int dia,int mes,int anno) {
		// TODO Auto-generated constructor stub
		this.anno=anno;
		this.dia=dia;
		this.mes=mes;
				
	}
	public void mostrarFecha(){
		System.out.println("Dia: "+ dia+" Mes : "+mes+" Año : "+anno);
	}
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAnno() {
		return anno;
	}
	


	
}
