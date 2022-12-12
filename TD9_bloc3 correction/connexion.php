<?php

//récupération variable
$email=$_POST["email"];
$mdp=$_POST["mdp"];

//on se connecte à la BDD
$bdd = new pdo('mysql:host=localhost;dbname=TD8_bloc3', 'root', '');

//on prépare la requête
$stmt = $bdd->prepare('SELECT * from acheteur where email=? AND motdepasse=?');
//on l'éxecute avec les 2 paramètres ?
$stmt->execute([$email,$mdp]);
//on met la ligne de résultat dans $ligne
$ligne=$stmt->fetch();

//si j'ai bien une ligne = on vérifie que la colonne id est null
if (isset($ligne["id"]))
{
    echo "Connexion OK";
    $id=$ligne["id"];

    //on prépare la requête
    $stmt = $bdd->prepare('SELECT * from voir where idAcheteur= :id');
    //on l'éxecute avec le paramètres
    $stmt->execute(["id"=>$id]);

    echo "<br>Voici vos notes:";
    //tant que j'ai des lignes je stock ma ligne courante dans $ligne
    while($ligne = $stmt->fetch())
    {

        echo "<br>$ligne[note]";

    }
}
else
{
    echo "Echec connexion";
}

?>
