import java.util.Scanner;
public class MesAnosIdade {
	public static void main(String[]args) {
		int anoNasc, anoAtual, idade;
		Scanner in=new Scanner(System.in);
		System.out.println("digite o ano de nascimento");
		anoNasc = in.nextInt();
		System.out.println("digite o ano atual");
		anoAtual = in.nextInt();
		idade = anoAtual - anoNasc;
		System.out.println("a idade é de: "+idade + " anos");
		in.close();
		
		
	}

}
