
import java.util.Scanner;
public class Peso {
	public static void main (String[]args) {
		double p,alt,imc;
		Scanner in= new Scanner(System.in);
		System.out.println("digite o peso");
		p=in.nextDouble();
		System.out.println("digite a altura");
		alt=in.nextDouble();
		imc=p/ (alt*alt);
		System.out.println("imc");
		if(imc <18.5){
			System.out.println("excesso de magreza");
		} else if(imc >18.5 & imc <25){ 
			System.out.println("peso normal");
		}	else if(imc >25 & imc <30) {
			System.out.println("excesso de peso");
		}   else if(imc >30 & imc <35) {
			System.out.println("obsidade grau I");
		}	else if(imc >35 & imc <40) {
			System.out.println("obsidade grau II");
		}   else
			System.out.println("obsidade grau III");
		in.close();
		
			
		
	}

}
