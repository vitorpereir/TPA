import java.util.Scanner;

public class Potencia {
	public static void main (String[]args){
		Scanner in = new Scanner (System.in);
		int base,ex,po,i=1;
		i=1;
		System.out.println("digite o numero da base");
		base = in.nextInt();
		System.out.println("digite o numero do expoente");
		ex = in.nextInt();
		po = base;
		while (i<ex) {
			po = po*base;
			i++;
		}
		System.out.println("o resultado da potencia é"+po);
		in.close();
	}
}

