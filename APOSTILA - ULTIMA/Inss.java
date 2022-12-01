import java.util.Scanner;
public class Inss {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int s,des=0;
		int i = 1;
		
		while(i<=4){
			System.out.println("digite o salario");
			s = in.nextInt();
			if(s <= 2000) {
				des = s*85/100;
			}else {
				des = s*11/100;
			}
			System.out.println("o desconto é"+des);

			i++;	
			}
			
			in.close();
		}
	}


