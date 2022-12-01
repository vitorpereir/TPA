package alunoidade;
import java.util.Scanner;
public class alunoidade {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int id;
		System.out.println("digite a idade do aluno");
		id = in.nextInt();
		switch(id) {
		case 6:
			System.out.println("dente de leite");
			break;
		case 7:
			System.out.println("junior");
			break;
		case 8:
			System.out.println("junior max");
			break;
		case 9:
			System.out.println("junior master");
			break;
		case 10:
			System.out.println("master");
			break;
		default:
			System.out.println("idade invalida");





			
		}
	}
}
