package tp1.ejercicio7;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class InvertirArrayList {
	
	public static void invertirArrayList (List<Integer> lista) {
		if (!lista.isEmpty()) {
			int i = 0;
			int k = lista.size() - 1;
			helper(lista, i,k);
		}
		return;
	}
	
	private static void helper (List<Integer> lista , int i, int k) {
		// caso base? que choquen los dos indices
			// si no chocan, intercambio y llamo sumando y decrementando indices
		if (k > i ) {
			int aux = lista.get(i);
			lista.set(i, lista.get(k));
			lista.set(k, aux);
			
			helper(lista, i+1, k-1);
		}
		return;
	}
	
	
	public static void main (String [] args) {
	
		List<Integer> lista = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		
		//lista de 5 números
		for (int i = 0 ; i < 5; i++) {
			System.out.print("Num: ");
			lista.add(s.nextInt());
		}
		s.close();
		
		//método estático que invierte la lista
		invertirArrayList(lista);
		
		for (int num : lista) {
			System.out.print(num + "");
		}
		
	}
	
}
