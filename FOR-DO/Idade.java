import java.util.*;
public class Idade { 
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int res = 1, anoAtual, anoNasc, id;

			System.out.print("Digite o ano atual ");
			anoAtual = in.nextInt();
			do {
				System.out.print("Digite o ano de nascimento ");
				anoNasc = in.nextInt();
				id = anoAtual-anoNasc;
				System.out.println(id+" anos");
				if (id >= 18) {
					System.out.print("Maior de idade");
				}else {
					System.out.print("Menor de idade");
				}
				System.out.println("\nDeseja continuar a execução? (1-para SIM ou 2-para NÃO)");
				res = in.nextInt();
			}while(res!=2);
			System.out.println("---- Fim da execução ----");
			in.close();
		}
	}


