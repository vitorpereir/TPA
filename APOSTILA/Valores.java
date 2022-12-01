import java.util.Scanner;
public class Valores {
	public static void main(String[]args) {
		int valor1,valor2,valor3,q1,q2,q3,soma;
		Scanner in = new Scanner(System.in);
		System.out.println("digite o primeiro valor");
		valor1 = in.nextInt();
		System.out.println("digite o segundo valor");
		valor2 = in.nextInt();
		System.out.println("digite o terceiro valor");
		valor3 = in. nextInt();
		q1 = valor1*valor1;
		q2 = valor2*valor2;
		q3 = valor3*valor3;
		soma = q1+q2+q3;
		System.out.println("a soma é de"+soma);
		in.close();
    }

}
