package exercicios;

import java.util.Scanner;

public class SalarioMInimo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n;
		
		System.out.println("Digite um número:");
		n = in.nextDouble();
		
		if (n == 0) {
			System.out.println("Número neutro.");
		} else if (n > 0) {
			System.out.println("Número positivo.");
		} else {
			System.out.println("Número negativo.");
		}
		in.close();
	}
}
