import java.util.Scanner;
public class MaiorMenorV {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[] = new int[TAM];
		int maior = 0, menor = 0;
		
		for(int i=0;i<TAM;i++) {
			System.out.print("Digite o "+(i+1)+"� numero: ");
			a[i] = in.nextInt();
		}
		
		for(int i=0;i<TAM;i++) {
			if(a[i]>maior) {
				maior = a[i];
			}
			if(a[i]<menor || i==0) {
				menor = a[i];
			}
		}
		System.out.println("O maior numero digitado �: "+maior);
		System.out.println("O menor numero digitado �: "+menor);
		
		in.close();
	}
}



