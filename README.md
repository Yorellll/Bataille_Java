⚠️CE PROJET A ÉTÉ RÉALISÉ DANS UN CADRE UNIVERSITAIRE. IL A ÉTÉ DÉPOSÉ SUR CE GIT POUR CORRECTION, LE CODE PEUT DONC CONTENIR DES ERREURS⚠️

# Bataille_Java

Le programme se déroule ainsi:

Dans un premier temps, on créé le paquet de jeu, de manière simple, on associe une couleur à ses 13 valeurs, (par exemple en premier on associe "coeur", à toutes les valeurs possible "as", "deux", "trois"...
Une fois terminé on continue avec la valeur suivante et ainsi de suite), une fois fini on a notre paquet de 52 cartes.</br>

Dans un second temps, on le randomise, afin de mélanger le paquet, puis on distribue les cartes à chaque joueur (26 cartes chacun).</br>

Ensuite on commence à jouer, chaque joeur tire une carte de son paquet, chacune d'entre elles est ajoutée à un paquet sur le coté. Ce paquet est ensuite parcouru afin de vérifier que les futures cartes tirées n'ont pas déjà été tirées. 
Si elles l'ont déjà été, alors on en tire à nouveau, tout en vérifiant que c'est une nouvelle carte.</br>
Pour finir on compare chacune des cartes, grâce à l'index des valeurs, et on ajoute au joueur ayant la plus forte, un point. Le joueur en ayant le plus est affiché à la fin avec son nombre de points.</br>
