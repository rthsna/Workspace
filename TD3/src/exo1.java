import java.util.Scanner;
public class exo1 {

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
					System.out.println("Le nombre est correct");
				}
				if (nombre<reponse)
				{
					System.out.println("Le nombre est plus grand");
				}
				if (nombre>reponse)
				{
					System.out.println("Le nombre est plus petit");
				}
			}while(nombre!=reponse);

			System.out.println("Voulez-vous recommencer? 0 pour recommencer / 1 pour ne pas recommencer ");
			recommencer=maSaisie.nextInt(); 

		} while (recommencer==0);




	}
}