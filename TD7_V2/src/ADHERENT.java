import java.util.ArrayList;
import java.util.Date;

public class ADHERENT {
	private String nom;
	private String prenom;
	private int genre ;
	private String daten;
	private String categ;
	private String adresse;
	private String tel;
	private ArrayList<COMPTE> lstcomptes ;
	public ADHERENT(String nom, String prenom, int genre, String daten, String categ, String adresse, String tel,
			ArrayList<COMPTE> lstcomptes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.daten = daten;
		this.categ = categ;
		this.adresse = adresse;
		this.tel = tel;
		this.lstcomptes = lstcomptes;
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
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
	public String getDaten() {
		return daten;
	}
	public void setDaten(String daten) {
		this.daten = daten;
	}
	public String getCateg() {
		return categ;
	}
	public void setCateg(String categ) {
		this.categ = categ;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public ArrayList<COMPTE> getLstcomptes() {
		return lstcomptes;
	}
	public void setLstcomptes(ArrayList<COMPTE> lstcomptes) {
		this.lstcomptes = lstcomptes;
	}
	public void INFO_COMPTE()
	{      
		int i;
		String type;
		if (genre==1)
	      type = "M.";
	    else 
		   type = "MME";
		System.out.println("liste des comptes de "+type+""+nom+""+prenom);
		for (i=0;i<lstcomptes.size();i++)
		{lstcomptes.get(i).DECRIRE();}
	      
	    		  
		
	}
	
	
	
	
		
      
}
