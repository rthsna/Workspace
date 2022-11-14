import java.util.Date;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class main {

	
	  public static void main(String[]args ) throws Throwable {
                 // TODO auto-generated method stub 
              
		   /*AUTEUR a1,a2;
		   LIVRE l1,l2;
		   ADHERENT ad1,ad2;
		   a1= new AUTEUR("Saina","RATSIMIHAH","1/03/2003","JAV4");
		   a2= new AUTEUR("Alex","DJIBOUTI","12/09/2003","PHP"); 
		   l1=new LIVRE ("JAV4","Programmer en Java",20,ad1,a1);
		   ad1=new ADHERENT ("bob","leponge","bob@eponge.fr",); 
		   */
            String BDD = "AP_2";
            String url="jdbc:mysql://localhost:3306/" + BDD;
            String user = "root";
            String psswd= "";
            
            	{Class.forName("com.mysql.jdbc.Driver");
            	//connexion à la BDD
            	Connection conn = DriverManager.getConnection(url,user,psswd);
            	System.out.println("Connection OK");
                
            	
            	ArrayList<LIVRE> listLivre;
            	ArrayList<ADHERENT> listAdherent;
            	ArrayList<AUTEUR> listAuteur;
            	
            	
            
            	ResultSet resultat;
            	 String requete = "SELECT * FROM livre";  
               
            //Récupération Livre 
                  {
                	 Statement stmt = conn.createStatement();
                	 resultat = stmt.executeQuery(requete);
                	 System.out.println("ok");
                	 while (resultat.next()) {
                		 LIVRE livre= new LIVRE (resultat.getString(0),resultat.getString(1), resultat.getFloat(2));}
                	    
                		 
                              
                  
                  }
                                    }
           
           
	  }

	private static int resultat;int getInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getAUTEUR(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getADHERENT(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}

	  



