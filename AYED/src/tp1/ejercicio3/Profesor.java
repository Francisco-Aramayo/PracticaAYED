package tp1.ejercicio3;

public class Profesor extends Persona{
	private String catedra;
	private String facultad;
	
	public Profesor (String nombre, String apellido,
			String email, String catedra, String facultad) {
		super(nombre,apellido,email);
		this.catedra = catedra;
		this.facultad = facultad;
	}
	
	public String tusDatos() {
		return super.tusDatos() + this.catedra +"/"+
				this.facultad + "\n";
	}
}
