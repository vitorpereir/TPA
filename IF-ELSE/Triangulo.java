import java.util.Scanner;
public class Triangulo {
	public static void main(String[]args) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
		System.out.println("digite o primeiro valor");
		a=in.nextInt();
		System.out.println("digite o segundo valor");
		b=in.nextInt();
		System.out.println("digite o terceiro valor");
		c=in.nextInt();
		if (a==b & a==c){
			System.out.println("equilatero");
		}else if (a!=b &b!=c & a!=c) {
		System.out.println("escaleno");
		} else {
		System.out.println("isósceles");
		}
		in.close();
		
		}
	}

