import java.util.Scanner;
public class Rodizio {
	public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
		int np;
		System.out.println("Digite o ultimo numero da placa");
		np = in.nextInt();
		switch(np) {
			case 1:
			case 2:
				System.out.println("Segunda-Feira");
				break;
		    case 3:
		    case 4:
		    	System.out.println("Terça-Feira");
				break;
		    case 5:
		    case 6:
		    	System.out.println("Quarta-Feira");
				break;
		    case 7:
		        System.out.println("Sexta-Feira");
		        break;
		   default:
			   System.out.println("Dia invalido");
		}
	}
}
