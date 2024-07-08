package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Soma_impares
		/*
		 Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
impares entre eles.
exemplo:
Digite dois numeros:
2
9
SOMA DOS IMPARES = 15

		 */
		int x;
		int y;
		int somaImpar;
		int troca;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x > y) {
			troca = x;
			x = y;
			y = troca;
		}
		
		somaImpar = 0;
		
		for (int i = x + 1; i < y; i++ ) {
			if(i % 2 != 0) {
				somaImpar = somaImpar + i;
			}
		}
		
		System.out.printf("SOMA DOS IMPARES = %d\n", somaImpar);
		
		sc.close();
	}

}
