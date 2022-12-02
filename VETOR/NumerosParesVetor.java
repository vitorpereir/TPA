import java.util.Scanner;
public class NumerosParesVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[] = new int[TAM];
		int v = 0;
		
		for(int i=0; i<TAM; i++) {
			System.out.print("digite um numero para o elemento "+(i+1)+" do vetor: ");
			a[i] = in.nextInt();
		}
		
		System.out.print("Os numeros pares sao: ");
		for(int i=0;i<TAM;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
				v++;
			}
		}
		System.out.println(v+" numeros pares.");
		in.close();
	}
}


