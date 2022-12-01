import java.util.Scanner;
public class Fatorial {
	public static void main (String[]args) {
		Scanner in=new Scanner(System.in);	
		int n,i,fat = 1;
		System.out.println("digite um numero inteiro");
		n = in.nextInt();
		while(n>0) {
		fat=fat*1;
		n++;
		System.out.println("fatorial"+fat);

		}
			
			
			
		
	}
}


