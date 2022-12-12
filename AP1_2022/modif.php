<?php
session_start();
?>
<html>
<head> <link href="style.css" media="all" rel="stylesheet" type="text/css"/> </head>

<ul class="nav">
  <li><a href="accueil.php">Accueil</a></li>
  <li><a href="perso.php">Profil</a></li>
  <li><a href="cr.php">Compte rendus</a></li>
  <li><a href="ccr.php">Nouveau compte-rendu</a></li>


<?php
include '_conf.php';
 if($connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD))
      { $id=$_SESSION["id"];
        $idCR=$_GET["id"];
        $requete="SELECT * FROM CR WHERE CR.num = $idCR ";
        $resultat = mysqli_query($connexion, $requete);
        while($donnees= mysqli_fetch_assoc($resultat))
         {
         $contenu=$donnees['description'] ;
         }  
      }
 
        
 
?>

<FORM method="post" action="cr.php"> 

<br> 
<div> Date <input type="date" name="date" required> </div>
<div> Contenu <textarea name="contenu" rows=10 cols=40></textarea>
<?php
    echo $contenu;
?>
</textarea>
<br>
<div> <button type="submit" name="update"> Confirmer </button>


</html>

