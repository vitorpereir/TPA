import java.util.Scanner;
public class IdadeAltura {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int anoAtual,idade,anoNasc,i = 1,idadeVelho,idadeNovo,a;
		double media = 0,somaaltura = 0,alt;
		
		System.out.println("digite o ano atual");
		anoAtual = ler.nextInt();
			
	System.out.println("digite o ano de nascimento do "+ i + "usuario");
		anoNasc =	ler.nextInt();
		
		idade = (anoAtual-anoNasc);
		idadeVelho = idade;
		idadeNovo = idade;
	
		for(i = 2;i<= 10;i++) {
			System.out.println("digite o ano de nascimento do "+ i + "usuario");
			anoNasc =ler.nextInt();
			idade = (anoAtual-anoNasc);
			if(idade < idadeNovo) {
				idadeNovo = idade;
			}else if(idade > idadeVelho) {
				idadeVelho = idade;
			}
			
			}
		for(a = 1; a<=10; a++) {
			System.out.println("Digite a altura do "+ a + "usuario");
			alt= ler.nextDouble();
			somaaltura = (somaaltura+alt);
			media = somaaltura/a;
			
			
			
		}
		System.out.println(" o mais novo tem : "+ idadeNovo + " anos" );
		System.out.println("o mais velho tem : "+idadeVelho +" anos");
		System.out.printf("A média de altura é:" +media);
		
		ler.close();
		}

	






	}


	

