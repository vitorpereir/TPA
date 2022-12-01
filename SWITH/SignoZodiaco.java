import java.util.Scanner;
public class SignoZodiaco {
	public static void  main (String[]args) {
		Scanner in = new Scanner(System.in);
		int m,d;
		System.out.println("Digite o mes");
		m = in.nextInt();
		System.out.println("Digite o dia");
		d = in.nextInt();
		switch(m) {
		case 1:
			if(d<20) {
				System.out.println("Capricornio");
			}else {
                System.out.println("Aquario");
                break;
        case 2:
        	if(d<19) {
        		System.out.println("Aquario");
           }else {
        	   System.out.println("Peixes");
        	   break;
        case 3:
        	if(d<21) {
        		System.out.println("Peixes");
        	}else {
        	    System.out.println("Aries");
        	    break;
        case 4:
        	if(d<=20) {
        		System.out.println("Aries");
        	}else {
        		System.out.println("Touro");
        		break;
        case 5:
           if(d<21) {
        	   System.out.println("Touro");
           }else {
        	   System.out.println("Gemeos");
        	   break;
        case 6:
        	if(d<=22) {
        		System.out.println("Gemeos");
        	}else {
        		System.out.println("Cancer");
        		break;
        case 7:
        	if(d<23) {
        		System.out.println("Cancer");
        	}else {
        		System.out.println("Leao");
        		break;
        case 8:
        	if(d<23) {
        		System.out.println("Leao");
        	}else {
                System.out.println("Virgem");
                break;
        case 9:
        	if(d<23);
        	   System.out.println("Virgem");
        	}else {
        		System.out.println("Libra");
        		break;
        case 10:
        	if(d<23) {
        		System.out.println("Libra");
        	}else {
        		System.out.println("Escorpiao");
        		break;
        case 11:
        	if(d<22) {
        		System.out.println("Escorpiao");        	}
        	}else {
        		System.out.println("Sargitario");
        		break;
        case 12:
        	if(d<22) {
        		System.out.println("Sargitario");
        	}else {
        		System.out.println("Capricornio");
        default;
        		
        	}
        	
           
		}
	}
}
