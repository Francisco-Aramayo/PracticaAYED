package tp1.ejercicio7;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
public class SumarLinked {
	// si la lista vacia ....
	public static int sumarLinkedList(List<Integer> lista) {
		if (!lista.isEmpty()) return helper(lista, 0); 
		return Integer.MAX_VALUE;
	}
	// i es la posición actual
	private static int helper (List<Integer> lista , int i) {
		// caso base:
		int res = lista.get(i);
		if (i < lista.size() - 1) {
			res += helper(lista, ++i);
		}
		return res;
	}
	
	
	public static void main (String [] args) {
		
		List<Integer> lista = new LinkedList<>();
		
		Scanner s = new Scanner(System.in);
		
		//lista de 5 números
		for (int i = 0 ; i < 5; i++) {
			System.out.print("Num: ");
			lista.add(s.nextInt());
		}
		s.close();
		
		//método estático que invierte la lista
		int resultado = sumarLinkedList(lista);
		
		for (int num : lista) {
			System.out.print(num + "");
		}
		System.out.println();
		System.out.print("Resultado: " + resultado);
		
	}
	
}
