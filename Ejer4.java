package Array;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[] numero = new int[10];
		int positivo = 0;
		int negativo = 0;
		int cero = 0;
		int a;

		System.out.println("Dime 10 numeros aleatorios");

		for (a = 0; a < numero.length; a++) {
			System.out.println("numero entero = ");
			numero[a] = teclado.nextInt();
		}

		for (a = 0; a < numero.length; a++) {
			if (numero[a] > 0) {
				positivo++;
			}

			if (numero[a] < 0) {
				negativo++;
			} else {
				cero++;
			}
		}

		System.out.println("Positivos= " + positivo);
		System.out.println("Negativos= " + negativo);
		System.out.println("Ceros= " + cero);
	}
}
