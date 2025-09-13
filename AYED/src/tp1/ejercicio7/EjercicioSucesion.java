package tp1.ejercicio7;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class EjercicioSucesion {
	public static List<Integer> calcularSucesion (int n) {
	
		List<Integer> listita = new ArrayList<>();
		
		helper(listita,n);
		
		return listita;
	
	}
	private static void helper (List<Integer> lista , int n) {
		//siempre termina en 1
		// si es par n/2
		// si es impar 3n + 1
		// primero n, luego el calculo
		lista.add(n);
		if (n > 1) {
			if (n % 2 == 0) {
				helper(lista , n/2);
			}else {
				helper(lista, 3*n+1);
			}
		}
		return;
	}
	
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca n: ");
		int n = s.nextInt();
		s.close();
		List<Integer> sucesion = new ArrayList<>();
		
		sucesion = calcularSucesion(n);
		
		for (int num : sucesion) {
			System.out.print(num + "-");
		}
	}
}
