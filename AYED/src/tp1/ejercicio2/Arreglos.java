package tp1.ejercicio2;

import java.util.Scanner;

public class Arreglos {
	public static int [] devolverArregloMultiplos (int n) {
		int [] arregloM = new int [n];
		for (int i = 0 ; i < n ; i++) {
			arregloM[i] = (i+1) * n;
		}
		System.out.println("");
		return arregloM;
		
	}
	
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese tamaño: ");
		int n = s.nextInt();
		int [] arreglo = devolverArregloMultiplos(n);
		
		for (int num : arreglo) {
			System.out.print(num + "- ");
		}
		s.close();
	}
}
