# Bataille_Java

Le programme se déroule ainsi:

Dans un premier temps, on créé le paquet de jeu, de manière simple, on associe une couleur à ses 13 valeurs, (par exemple en premier on associe "coeur", à toutes les valeurs possible "as", "deux", "trois"...
Une fois terminer on continue avec la valeur suivant et ainsi de suite), une fois finis on a notre paquet de 52 cartes.</br>

Dans un second temps, on le randomise, afin de mélanger le paquet, puis on distribue les cartes à chaque joueur (26 cartes chacun).</br>

Ensuite on commence à jouer, chaque joeur tire une carte de son paquet, chacune d'entre elle est ajouté à un paquet sur le coté. Ce paquet est ensuite parcouru afin de vérifier que les future carte tiré n'ont pas déjà été tiré. 
Si elles l'ont déjà étét, alors on en retire une, toute en vérifiant toujours que c'est une nouvelle carte. Pour finir on compare chacune des cartes, grâce à l'index des valeurs, et on ajoute au joueur ayant la plus forte un point. 
Pour finir on affiche le joueur gagnant avec son nombre de point.
