package tp1.ejercicio5;


public class DevolverValores {
	
	public static String valores (int [] numeros) {
		int max = numeros[0]; int min = numeros[0];
		double tot = 0;
		
		for (int num : numeros) {
			if (num >= max) {
				max = num;
			}else if (num <= min) {
				min = num;
			}
			tot += num;
		}
		return "Max: " + max + "/ Min: " + min + "/ Prom: "
		+ tot /numeros.length;
		
	}
	
	public Resultados devolverValores2 (int [] numeros) {
		int max = numeros[0]; int min = numeros[0];
		double tot = 0;
		
		for (int num : numeros) {
			if (num >= max) {
				max = num;
			}else if (num <= min) {
				min = num;
			}
			tot += num;
		}
		double prom = tot / numeros.length;
		return new Resultados(max,min,prom);
	}
	
	public static void main (String [] args) {
		int[] numeros = {10, 20, 30, 40, 50};
		
		
		
		System.out.println(valores(numeros));
		
		
	}
}
