import java.util.Scanner;
public class Meses {
  public static void main(String[]args) {
	  Scanner in = new Scanner(System.in);
	  int mes;
	  System.out.println("Digite o mes");
	  mes = in.nextInt();
	  switch(mes) {
	  case 1:
	  case 3:
	  case 5:
	  case 7:
	  case 8:
	  case 10:
	  case 12:
		  System.out.println("Mêses terminados em 31");
		  break;
	  case 4:
	  case 6:
	  case 9:
	  case 11:
		  System.out.println("Meses terminados em 30");
		  break;
	  case 2:
		  System.out.println("Mêses terminados em 28");
		  break;
	  default:
		  System.out.println("Mês invalido");
		  
	  }
  }
}
