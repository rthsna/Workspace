
public class LIVRE {
    private String ISBN ;
    private String titre;
    private Float prix;
     
    private ADHERENT Emprunteur;
    private AUTEUR Auteur;
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Float getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = (float) prix;
	
	}
	public AUTEUR getAuteur() {
		return Auteur;
	}
	public void setAuteur(AUTEUR auteur) {
		Auteur = auteur;
	}
	public void AFFICHER() {
		System.out.println("Voici les info du livre n°"+ISBN);
		System.out.println("titre : "+titre);
		System.out.println("prix : "+prix);
		System.out.println("nom Auteur :"+Auteur.getNom());
		if (Emprunteur==null)
			System.out.println("Livre dispo");
		else
		{
			System.out.println("Livre emprunté par : "+Emprunteur.getNom());
		}
	}
	
	public LIVRE(String iSBN, String titre, Float prix, ADHERENT emprunteur,AUTEUR auteur) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.prix = prix;
		Emprunteur=emprunteur; 
		Auteur = auteur;
	}
	public LIVRE(String string, String string2, AUTEUR a1, int i) {
		// TODO Auto-generated constructor stub
	}
	

		
    
}
