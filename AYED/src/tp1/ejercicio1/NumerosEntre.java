package tp1.ejercicio1;

public class NumerosEntre {
	public static void imprimirFor (int a , int b) {
		for (int i = a ; i <= b; i++ ) {
			System.out.print(i + "- ");
		}
	}
	
	public static void imprimirWhile (int a , int b) {
		while (a <= b) {
			System.out.print(a + "- ");
			a++;
		}
	}
	
	public static void imprimirRecursivo (int a , int b) {
		if (a <= b) {
			System.out.print(a + "- ");
			imprimirRecursivo(a+1,b);
		}else {
			return;
		}
	}
	
	public static void main (String [] args) {
		int a = 1; int b = 5;
		
		imprimirFor(a,b);
		System.out.println();
		imprimirWhile(a,b);
		System.out.println();
		imprimirRecursivo(a,b);
		System.out.println();
	}
}
