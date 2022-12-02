import java.util.Scanner;
public class VetorQuadrado {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i,a[],b[];
		a = new int [5];
		b = new int [5];
		
		for(i=0;i<5;i++) {
			System.out.println("entre com"+(i+1)+"valor");
			a[i] = ler.nextInt();
			b[i] = a[i]*a[i];
			
		}
		for (i = 0;i<5;i++) {
			System.out.print(a[i]+", ");
			
		}
		System.out.println();
		
		for (i = 0;i<5;i++) {
			System.out.print(b[i]+", ");
		}	
	}
}

