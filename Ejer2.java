package Array;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] numero = new int[10];
		int resultado = 0;
		int cont = 0;
		int cont2 = 0;

		for (cont = 0; cont < numero.length; cont++) {

			System.out.println("Dime varios numero " + cont + ": ");

			numero[cont] = teclado.nextInt();

			for (int cont4 = 0; cont4 < numero.length; cont4++) {
				if (numero[cont4] > 0) {
					resultado = numero[cont4] + resultado;
					cont2 = cont2 + 1;
					int maximo=0;
					
				}

			}
		}
		resultado = resultado / cont2;

		System.out.println("resultado media: " + resultado);

	}
}
