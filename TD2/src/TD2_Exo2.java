import java.util.Scanner;
public class TD2_Exo2 {

	public static void main(String[] args) {
		Scanner maSaisie = new Scanner (System.in);
		int calcul1,calcul2,point;


		System.out.println("Combien font 1+1 ?");
		calcul1=maSaisie.nextInt(); 

		if (calcul1 == 2)
		{
			point=10;
		}
		else 
		{
			point=0;
		}

		System.out.println("Combien font 2+2 ?");
		calcul2=maSaisie.nextInt(); 

		if (calcul2 == 4)
		{
			point=point+10;
		}
		else
		{
			point=point+0;
		}
		if (point ==0)
		{
			System.out.println("Tu peux revoir ce chapitre !");
		}
		else 
		{
			if (point == 10) 
			{
				System.out.println("Je crois que tu as compris l'essentiel ! Vien relire ce chapitre à l'occasion");
			}

			else
			{
				System.out.println("Bravo !");
			}



		}













	}



}
