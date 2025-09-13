package tp1.ejercicio9;
import tp1.ejercicio8.Stack;
import java.util.Scanner;
public class TestBalanceo {

	public static boolean estaBalanceada (String cadena) {
		if (cadena == null || cadena.isEmpty()) {
			return true;
		}
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0 ; i < cadena.length() ; i++) {
			char car = cadena.charAt(i);
			if (car == '(' || car == '[' || car == '{')
				stack.push(car);
			else if (car == ')' || car == ']' || car == '}') {
				if (stack.isEmpty()) {
					return false;
				}
				char aux = stack.pop();
				if ((car == ')' && aux != '(') ||
	                    (car == ']' && aux != '[') ||
	                    (car == '}' && aux != '{')) {
	                    return false;
	                }
			}
				
		}
		
		return stack.isEmpty();
	}
	
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca cadena: ");
		String cadena = s.nextLine();
		
		if (estaBalanceada(cadena)) {
			System.out.println("Esta balanceada!");
		}else {
			System.out.println("No esta balanceada");
		}
		
		s.close();
	}
}
