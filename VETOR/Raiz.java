import java.util.Scanner;
public class Raiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 5;
		double a[] = new double[TAM];
		double b[] = new double[TAM];
		
		for(int i=0; i<TAM; i++) {
			System.out.print("digite o item "+(i+1)+" do vetor: ");
			a[i] = in.nextDouble();
		}
		
		for(int i=0;i<a.length;i++) {
			b[i] = Math.sqrt(a[i]);
			if (i == 0) {
				System.out.print("[");
			}
			System.out.print(b[i] + " ");
			if(i == TAM-1) {
				System.out.print("]");
			}
		}
		in.close();
	}

}
