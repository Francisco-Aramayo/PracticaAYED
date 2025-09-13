package tp1.ejercicio7;
import tp1.ejercicio3.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class TestEstudiantes {
	
	public static void imprimir (List<Estudiante> listaE,
			List<Estudiante> listaE2) {
		System.out.println("Original");
		for (Estudiante e : listaE) {
			System.out.println(e.tusDatos());
		}
		System.out.println("Copia");
		for (Estudiante e : listaE2) {
			System.out.println(e.tusDatos());
		}
	}
	
	public static boolean existe (List<Estudiante> listaE,
			Estudiante e) {
		boolean ok = false;
		Iterator<Estudiante> it = listaE.iterator();
		while (!ok && it.hasNext()) {
			Estudiante actual = it.next();
			if (actual.equals(e)) ok = true;
		}
		return ok;
	}
	
	public static void main (String [] args) {
		List<Estudiante> listaE = new ArrayList<>();
		listaE.add(new Estudiante("mako","aramayo",
				"correo@mail.com", "1A", "19 1794"));
		listaE.add(new Estudiante("jere","milton",
				"correo@mail.com", "17", "19 1834"));
		
		List<Estudiante> listaE2 = new ArrayList<>(listaE);
		
		System.out.println("Previo a modificar----------");
		imprimir(listaE,listaE2);
		
		listaE.getFirst().setComision("XXX");
		System.out.println("Luego de modificar----------");
		imprimir(listaE,listaE2);

		Estudiante estuNue = new Estudiante("jere","milton",
				"correo@mail.com", "17", "19 1834");
		if (existe(listaE,estuNue)) {
			listaE.add(estuNue);
		}else {
			System.out.println("YA existe el estudiante");
		}
		
		
	}
}
