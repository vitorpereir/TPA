import java.util.Scanner;
public class Lucro {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		
		double preco,mlucro;
		String opt = "s";
		
		while(!opt.equalsIgnoreCase("n")) {
			System.out.println("digite o preco");
			preco = in.nextDouble();
			System.out.println("digite o lucro");
			mlucro = in.nextDouble();
			preco = preco + (preco*mlucro/100);
			System.out.println(preco);

			System.out.println("digite a opnião");
			opt = in.next();

		}
		in.close();
	}

}
