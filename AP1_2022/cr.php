<?php
session_start();
?>        
<html>
<head> <link href="style.css" media="all" rel="stylesheet" type="text/css"/> </head>
<body>

<?php

include '_conf.php';
if (isset($_POST['update'])) //recupere données de ccr.php
      { 
        $date=$_POST['date'];
        $note=$_POST['note'];
        $contenu= addslashes($_POST['contenu']);
        $ide=$_SESSION["id"];
        $connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD);
        $requete="INSERT INTO CR (date,datetime,description,Note,num_utilisateur) VALUES ('$date',NOW(),'$contenu',$note,$ide);";
        echo $_SESSION["id"]; //crée nouveau compte rendu avec infos recuperees
        echo "<br>$requete<hr>";
        if(!mysqli_query($connexion,$requete)) 
            {
            echo "erreur";
            }
        else //si possibilité de faire la requete :
            {
           echo "nouveau compte-rendu crée";
            }
        }
if (isset($_POST['modif'])) //recupere données de modif.php
      {
if(isset($_GET['id'])) /*verification que la variable est envoyé*/
{
  $nomvar=$_GET['id'];
}

        $contenu= addslashes($_POST['contenu']);
        $id=$_SESSION["id"];
        $connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD);
        $requete="UPDATE CR SET description = '$contenu' WHERE num_utilisateur=$id AND num=$nomvar"; //modif compte rendu avec infos recuperees
        if(!mysqli_query($connexion,$requete))  
            {
            echo "erreur";
            }
        else //si possibilité de faire la requete :
            {
           echo "compte-rendu modifié";
            }
        }
if ($_SESSION["type"] ==1) //si connexion en prof
  {
 ?>
  
    <ul class="nav">
    <li><a href="accueil.php">Accueil</a></li>
    <li><a href="perso.php">Profil</a></li>
    <li><a href="cr.php">Compte rendus</a></li>
    </ul> 
 
<?php 
if($connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD))
      {
        $id=$_SESSION["id"];     
        $requete="SELECT CR.*,UTILISATEUR.nom FROM CR,UTILISATEUR WHERE CR.num_utilisateur=UTILISATEUR.num ORDER BY date DESC"; //recupere tous les comptes rendus par date decroissante
        $resultat = mysqli_query($connexion, $requete);
        while($donnees = mysqli_fetch_assoc($resultat))
          {
            $num=$donnees['num'];
            $contenu=$donnees['description'];
            $nom = $donnees ['nom'];
            $date = $donnees ['date'];
            $note=$donnees['Note'];
            
            echo "<table border=2><thead> <tr> <th colspan=2> <u><center>Compte rendu n°$num de $nom</center></u> </th> </tr> </thead>
            <tbody> <tr> <td>  $contenu</td> </tr> <tr><td><center>Note données par l'éleve : $note</tr></td></center><tr> <td><center>$date</center> </td> </tr> </tbody> </table> <br>";  //affiche tous les compte rendus du plus recent au plus ancien + lien pour modifier
          }
    }

}
else //si connexion en eleve
  { 
    ?>
    
    <ul class="nav">
    <li><a href="accueil.php">Accueil</a></li> 
    <li><a href="perso.php">Profil</a></li>
    <li><a href="cr.php">Compte rendus</a></li>
    <li><a href="ccr.php">Nouveau compte-rendu</a></li>
    </ul>  <?php

       if($connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD))
      {
        $id=$_SESSION["id"];     
        $requete="SELECT CR.* FROM CR,UTILISATEUR WHERE UTILISATEUR.num = CR.num_utilisateur AND UTILISATEUR.num=$_SESSION[id] ORDER BY date DESC"; //recupere tous les comptes rendus par date decroissante
        $resultat = mysqli_query($connexion, $requete);
        while($donnees = mysqli_fetch_assoc($resultat))
          {
            $num=$donnees['num'];
            $contenu=$donnees['description'];
            $note=$donnees['Note'];
            $date=$donnees['date'];
            
            echo "<table border=2><thead> <tr> <th colspan=2> <u>n°$num</u> : le $date </th> </tr> </thead>
            <tbody> <tr> <td>  $contenu</td><td> note : $note</td> </tr> <tr> <td> 
<a href='modif.php?id=$num'>Modifier</a> </td> </tr> </tbody> </table> <br>";  //affiche tous les compte rendus du plus recent au plus ancien + lien pour modifier
          }
    }

 
    }  
?>
