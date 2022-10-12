import java.util.Scanner;
public class Exo4 {

	public static void main(String[] args) {
		Scanner maSaisie = new Scanner (System.in);

		float max,total,moyenne;
		int i = 0;
		float Tnote[] = new float [99];
		int nb = 0 ;
		max=0;
		total=0;
		

		for ( i = 0; i <= 3 - 1 ; i= i + 1)
		{
			System.out.println("Veuillez saisir la note de l'élève numéro " + ( i + 1 ) );
			Tnote [i] = maSaisie.nextFloat();
			total = Tnote [i] + total;
			
			
			if(Tnote[i] > nb)
			{
				nb = (int) Tnote[i];
			}
		
		}
			
		moyenne = ( total / 3 );
		System.out.println("La moyenne est de:" + moyenne);
		System.out.println("*******************");
		System.out.println("la note la plus haute:" + nb);
		

		
		
	}

}
