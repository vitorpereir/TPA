package exercicios;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double fahrenheit, celsius;
		
		System.out.println("Digite uma temperatura em Fahrenheit:");
		fahrenheit = in.nextDouble();
		
		celsius = (fahrenheit - 32) / 1.8;
		
		if (celsius < 15) {
			System.out.println("Frio.");
		} else if (celsius >= 15 && celsius < 22) {
			System.out.println("Ameno.");
		} else {
			System.out.println("Calor.");
		}
		in.close();
	}
}
