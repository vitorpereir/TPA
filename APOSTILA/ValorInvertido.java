import java.util.Scanner;
public class ValorInvertido{
	public static void main(String[]args) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
		System.out.println("digite um valor");
		a = in.nextInt();
		System.out.println("digite um valor");
		b = in.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("numero invertido é " + a + "," + b);
		in.close();
	}
}
