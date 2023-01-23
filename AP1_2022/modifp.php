<?php
session_start();
$id=$_SESSION["id"];
?>


<html>
<head> <link href="style.css" media="all" rel="stylesheet" type="text/css"/>
<title>Page de modification de compte rendu</title>
</head>
<body> </html>
<?php
include '_conf.php';

if($connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD))
{     
if ($_SESSION["type"] ==1) //si connexion en prof
  {
    ?>
    <html>
    <ul class="nav">
    <li><a href="accueil.php">Accueil</a></li>
    <li><a href="perso.php">Profil</a></li>
    <li><a href="cr.php">Compte rendus</a></li>
    </ul> </html> <?php
  }
else
  {
    ?>
    <html>
    <ul class="nav">
    <li><a href="accueil.php">Accueil</a></li>
    <li><a href="perso.php">Profil</a></li>
    <li><a href="cr.php">Compte rendus</a></li>
    <li><a href="ccr.php">Nouveau compte-rendu</a></li>
    </ul> </html> 
  

<?php }
include '_conf.php';
?>
<?php //  Formulaire pour modifier le profil ?>
<FORM method="post" action="modifp.php"> 
<p>Votre nom : <input type="text" name="nom"  /></p>
 <p>Votre prenom : <input type="text" name="prenom" /></p>
 <p>Votre email : <input type="text" name="email" /></p>
 <p>Votre tel : <input type="text" name="telephone" /></p>
 <p>Votre option : <select name="option">
    <option value="1">1</option>
    <option value="2">2</option> /></p>
 <p><input type="submit" value="OK"></p>
</form>

<?php 

// Récupérer les donnéées du formulaire

$nom = $_POST['nom'];
$prenom = $_POST['prenom'];
$email = $_POST['email'];
$tel = $_POST['telephone'];
$option = $_POST['option'];


$requete="UPDATE `utilisateur` SET 
`nom`=$nom,
`prenom`=$prenom,
`tel`=$tel,
`email`=$email,
`option`=$option, 
WHERE utilisateur.num=2";
$resultat=mysqli_query($connexion,$requete);
if (!mysqli_query($connexion,$requete))
{
  echo "<br>Erreur : " .mysqli_error($connexion)."<br>";
}
else
{
  echo " <br><center> <font color= limegreen> Nouvelle description insérée !</font>";
}



}


   
   
