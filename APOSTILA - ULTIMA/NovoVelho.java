import java.util.Scanner;
public class NovoVelho {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int id,idmax=0,idmin=0,n ,nmax=0,nmin=0;
		int i=1;
		while(i<=10) {
			System.out.println("digite o nome");
			n = in.nextInt();
			System.out.println("digite a idade");
			id = in.nextInt();
			if(id < idmax) {
				idmax=id;
				nmax=n;
			}if(id < idmin ) {
				idmin = id;
				nmin = n;
				i++;
				

			}
			System.out.println(nmax);
			System.out.println(nmin);
			System.out.println(idmin);
			System.out.println(idmax);
			



			


			
		}
	}

}
