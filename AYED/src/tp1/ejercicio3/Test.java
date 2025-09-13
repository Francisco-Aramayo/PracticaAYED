package tp1.ejercicio3;

public class Test {
	public static void main (String [] args) {
		Estudiante [] arregloE = new Estudiante[3];
		arregloE[0] = new Estudiante("mako","aramayo",
				"correo@mail.com", "1A", "19 1794");
		arregloE[1] = new Estudiante("Perez","Roland",
				"correo@mail.com", "5A", "17 1891");
		arregloE[2] = new Estudiante("mako","aramayo",
				"correo@mail.com", "1B", "15 1366");
		Profesor [] arregloP = new Profesor[2];
		arregloP[0] = new Profesor("Laura","Giusti","correo@mail.com",
				"CADP", "UNLP");
		arregloP[1] = new Profesor("Robert","Moore","correo@mail.com",
				"OO1", "UNLP");
		for (Estudiante e : arregloE) {
			System.out.print(e.tusDatos());
		}
		for (Profesor p : arregloP) {
			System.out.print(p.tusDatos());
		}
	}
}
