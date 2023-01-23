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

 </ul> 

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

<div> <font size=20 align="center">Modifier le compte rendu </font> </div> 
<br> 
<div> Date:   </div> $date=$donnees['date']
<div> Contenu: <br><textarea name="contenu" rows=10 cols=40></textarea>
</textarea>
<br><br>
<?php    
echo  $contenu;
?>
<br><br>
Note : <select name="note">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>

  </select>
<br><br>
<br>
<div> <button type="submit" name="update"> Modifier </button>


</html>

