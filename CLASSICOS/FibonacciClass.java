import java.util.Scanner;
	public class FibonacciClass {
		public static void main(String[] args) {
			int primeiro=0, segundo=1, proximo,n;
			Scanner in = new Scanner(System.in);
			System.out.println("Digite um numero ");
			n = in.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.print(segundo+" ");
				proximo=primeiro+segundo;
				primeiro=segundo;
				segundo=proximo;
			}
		
		}
	}

