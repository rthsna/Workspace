import java.util.Scanner;
public class TD2_Exo1 {

	public static void main(String[] args) {
		Scanner maSaisie = new Scanner (System.in);
		int nombre;
		
		System.out.println("Veuillez saisir un nombre ");
		nombre=maSaisie.nextInt(); 
		
		if (nombre>=50 && nombre<=100)
		{
			System.out.println("Le nombre est bien compris entre 50 et 100");
		}
		else 
		{
			System.out.println ("Le nombre n'est pas compris entre 50 et 100");
		}
		
	
		
	}

}
