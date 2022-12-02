import java.util.Scanner;
public class FinalPrimeiro {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int i=1,j,a[],b[];
		a = new int [5];
		b = new int [5];
		
		j = 4;
		for(i=0;i<5;i++) {
			System.out.println("digite o "+i+"elemento");
			a[i] = in.nextInt();
			b[j] = a[i];
			j--;
		}
		System.out.println("\nvetor a [");
		for(i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");

		System.out.print("\nvetor b [");
		for(i=0;i<5;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("]");

	}


}
