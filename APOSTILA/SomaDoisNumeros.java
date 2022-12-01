import java.util.Scanner;
public class SomaDoisNumeros {
	public static void main (String[]args){
		double n1,n2,soma;
		Scanner in=new Scanner(System.in);
		System.out.println("digite um numero");
		n1= in.nextDouble();
		System.out.println("digite um numeros");
		n2=in.nextDouble();
		soma=n1+n2;
		System.out.println("a soma de"+n1+ "e" +n2+"é igual a"+soma);
		in.close();
		
	}
}	
