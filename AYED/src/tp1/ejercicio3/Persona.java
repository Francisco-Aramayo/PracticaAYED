package tp1.ejercicio3;

public class Persona {
	private String nombre;
	private String apellido;
	private String email;
	
	public Persona (String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public String tusDatos() {
		return (nombre +"/"+ apellido +"/"+ email+"/");
	}
}
