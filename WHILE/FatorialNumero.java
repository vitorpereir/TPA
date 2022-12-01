import java.util.Scanner;
public class FatorialNumero {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int num,fat;
		System.out.println("digite um numero inteiro");
		num = in.nextInt();
		fat = num;
		while (num>1) {
			System.out.println(num+"x");
			fat = fat*(num-1);
			num = num-1;
		}
		System.out.println(fat);
		in.close();
	}


	
}
