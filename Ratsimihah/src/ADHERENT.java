import java.util.ArrayList;

public class ADHERENT {
       private String nom;
       private String prenom;
       private String email;
       public ArrayList<LIVRE> ListeLivre ;
	public ADHERENT(String nom, String prenom, String email, ArrayList<LIVRE> listeLivre) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		ListeLivre = listeLivre;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<LIVRE> getListeLivre() {
		return ListeLivre;
	}
	public void setListeLivre(ArrayList<LIVRE> listeLivre) {
		ListeLivre = listeLivre;
	}
	public void AddLivre (LIVRE Livre) {
		ListeLivre.add(Livre); 
		
	}
	public void RemoveLivre (LIVRE Livre) {
		ListeLivre.remove(Livre);
	}
	
	
	
	
	
       
       
}
