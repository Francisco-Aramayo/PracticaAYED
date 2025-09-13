package tp1.ejercicio7;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class TestArrayList {
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		for (int i = 0 ; i < 5 ; i++) {
			lista.add(s.nextInt());
		}
		s.close();
		
		for (int num : lista) {
			System.out.print( num + "- ");
		}
		
		// b- En comportamiento es lo mismo, pero si
		// fuesen muchos elementos consumiria mas memoria
		
		// c- Si, el for tradicional, listIterator, iterator
		// for each 
		
		
		
	}
}
