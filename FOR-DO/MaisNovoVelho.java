import java.util.*;
public class MaisNovoVelho {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoAtual=0, anoNasc=0, idade, velho = 0, novo = 0;
		
		for(int i = 1;i<=10;i++) {
			System.out.print("Digite o ano atual: ");
			anoAtual = in.nextInt();
			System.out.print("Digite o ano de nascimento do usuário "+i+":");
			anoNasc = in.nextInt();
			idade = anoAtual-anoNasc;
			System.out.println(idade);
			if(idade < novo) {
				novo = idade;
			}else if(idade > velho) {
				velho = idade;
			}
		}
		System.out.println("O mais velho tem "+velho+" anos, e o mais novo tem "+novo+" anos");
		}
	}

