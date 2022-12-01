import java.util.Scanner;
public class SucessorAntecessor {
	public static void main(String[]args) {
		int x,ant,suc;
		Scanner in = new Scanner(System.in);
		System.out.println("digite um numero");
		x =in.nextInt();
		ant = x-1;
		suc = x+1;
		System.out.println("o antecessor é "+ant+" o sucessor é "+suc);
		in.close();
	
	}
}