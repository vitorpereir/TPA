import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String[]args) {
	double base,altura,area;
	Scanner in=new Scanner(System.in);
	System.out.println("digite a base");
	base= in.nextDouble();
	System.out.println("digite a altura");
	altura=in.nextDouble();
	area=(base*altura)/2;
	System.out.println("a area de é "+area);
	in.close();
	
	
	}
}
