package tp1.ejercicio7;
// recibe 2 listas ordenadas y de uelve una nueva lista fusionando las 2
import java.util.ArrayList;
import java.util.Scanner;

public class CombinarOrdenado {
	
	public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1,
			ArrayList<Integer> lista2){
		ArrayList<Integer> resultado = new ArrayList<>();
		
		int i = 0; int k = 0;
		while (i < lista1.size() && k < lista2.size()) {
			if (lista1.get(i) < lista2.get(k)) {
				resultado.add(lista1.get(i));
				i++;
			}else {
				resultado.add(lista2.get(k));
				k++;
			}
		}
		
		// termino de agregar
		if (i < lista1.size()) {
	        resultado.addAll(lista1.subList(i, lista1.size()));
	    }
	    if (k < lista2.size()) {
	        resultado.addAll(lista2.subList(k, lista2.size()));
	    }
		
		
		return resultado;
	}
	
	
	
	
	public static void cargarLista(ArrayList<Integer> lista, Scanner s) {
		
		System.out.print("-1 para terminar: ");
		int n = s.nextInt();
		while (n != -1) {
			lista.add(n);
			System.out.print("-1 para terminar: ");
			n = s.nextInt();
		}
		System.out.println("Fin de carga!");
		
	}
	
	public static void imprimirLista(ArrayList<Integer> lista) {
		for (int n : lista) {
			System.out.print(n + "- ");
		}
		System.out.println();
	}
	
	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		
		cargarLista(lista1,s);

		cargarLista(lista2,s);
		
		imprimirLista(lista1);
		imprimirLista(lista2);
		
		s.close();
		
		CombinarOrdenado combinar = new CombinarOrdenado();
		
		ArrayList<Integer> resultado = combinar.combinarOrdenado(lista1, lista2);
		
		imprimirLista(resultado);
		
		
	}
}
