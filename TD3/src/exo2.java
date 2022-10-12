import java.util.Scanner;
public class exo2 {

	public static void main(String[] args) {
		Scanner maSaisie = new Scanner (System.in);

		int nb;
		int i;
		float Tnote[] = new float [99];
		float total = 0;
		float moyenne;
		int nbSUP=0;
		
		
		System.out.println("Nombre d'élèves");
		nb = maSaisie.nextInt(); 

		for(i=0; i<=nb-1;i=i+1)
		{
			System.out.println("Saisir la note de l'élève n° "+(i+1));
			Tnote[i] = maSaisie.nextInt(); 
			
			total=(int)(Tnote[i]+total);

		}
		
		moyenne = total/nb;

		System.out.println(moyenne);

		if ( nbSUP>moyenne)
		{
			System.out.println("Note superieur à la moyenne: "nbsup);
		}
		
		
		
	}

}
