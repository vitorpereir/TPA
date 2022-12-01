import java.util.Scanner;
public class SomatoriaNumeros {
	public static void main (String[]args) {
		int soma=1, i = 1;
		
		while (i<=100) {
			System.out.print("+"+soma+"=");
			i++;
			soma = soma + i;
		}
	}
}
