package tp1.ejercicio3;

public class Estudiante extends Persona{
	private String comision;
	private String direccion;
	
	public Estudiante (String nombre, String apellido,
			String email, String comision, String direccion) {
		super(nombre, apellido, email);
		this.comision = comision;
		this.direccion = direccion;
	}
	
	public String tusDatos() {
		return super.tusDatos() + this.comision
				+"/"+ this.direccion + "\n";
	}
	
	public void setComision(String comision) {
		this.comision = comision;
	}
}
