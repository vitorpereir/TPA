import java.util.Scanner;
public class Altura {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int i = 0;
		double j=137,p=145;
		while (j<=p) {
			j = j + 2.5;
			p = p + 2;
			System.out.println("idade jo�o"+j / 100 +"metros");
			System.out.println("idade pedro"+p / 100 +"metros");
			i++;
			
		}
		System.out.println("� necessario "+i+"anos para jo�o ficar mais alto que pedro");
		in.close();

			
		
			
	}
		
	}	



