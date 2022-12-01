import java.util.Scanner;
public class MesAnos {
	public static void main(String[]args) {
		int dia,mes,ano;
		Scanner in = new Scanner(System.in);
		System.out.println("digite o dia");
		dia = in.nextInt();
		mes = dia/30;
		ano = dia/365;
		System.out.println("dias invertidos é "+mes+";"+ano);
		in.close();
	}

}
