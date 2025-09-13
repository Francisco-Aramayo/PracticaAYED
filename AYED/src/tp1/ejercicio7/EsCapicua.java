package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EsCapicua {
	
	public static boolean esCapicua(List<Integer> patente) {
		int i = 0; int k = patente.size() - 1;
		while (k > i) {
			if (!patente.get(i).equals(patente.get(k))){
				return false;
			}
			i++;
			k--;
		}
		return true;
		
	}
	
	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);

		List<Integer> patente = new ArrayList<>();
		
		for (int i = 0 ; i < 6 ; i++) {
			patente.add(s.nextInt());
		}
		
		s.close();
		
		for (int num : patente) {
			System.out.print(num);
		}
		
		System.out.println(esCapicua(patente));
	}
}
