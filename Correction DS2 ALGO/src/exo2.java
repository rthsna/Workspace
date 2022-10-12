import java.util.Scanner;
public class exo2 {

	public static void main(String[] args) {
		Scanner maSaisie = new Scanner (System.in);


		int nombre;
		int max=100;int min=1;
		int reponse;
		int recommencer;

		do {
			reponse=(int)((Math.random()*(max-min))+min);
			System.out.println("réponse="+reponse);


			do
			{

				System.out.println("Saisir un nombre");
				nombre=maSaisie.nextInt(); 

				if (nombre==reponse)
				{
					System.out.println("BINGO ! Le chiffre mystere etait le "+reponse);
				}
				if (nombre<reponse)
				{
					System.out.println("Trop petit: Essaie Encore");
				}
				if (nombre>reponse)
				{
					System.out.println("Trop grand: Essaie Encore");
				}
			}while(nombre!=reponse);
			
			System.out.println(" **** ");
			
			System.out.println("Souhaitez-cous refaire une partie ? 0 pour recommencer / 1 pour arreter ");
			recommencer=maSaisie.nextInt(); 
			
			
		
		} while (recommencer==0);




	}
}
