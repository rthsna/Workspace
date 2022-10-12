import java.util.Scanner;
public class exo1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Veuillez saisir votre age");
		int age = sc.nextInt();
		if (age>40)
		{
			System.out.println("Vétéran");
		}
		else 
		{
			if (age>=18)
			{
				System.out.println("Senior");
			}
			else 
			{
				 
				System.out.println("Mineur");
			}
			
			
	}
}
}

			