//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bataille {
    public Bataille() {
    }

    public static void main(String[] args) {

        Carte[] paquetP1 = new Carte[26];
        Carte[] paquetP2 = new Carte[26];
        Carte[] paquetEntier = new Carte[52];
        Joueur player1 = new Joueur(paquetP1, 0);
        Joueur player2 = new Joueur(paquetP2, 0);
        String[] couleur = new String[]{"Coeur", "Pique", "Carraux", "Trefle"};
        String[] valeur = new String[]{"As", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf", "Dix", "Valet", "Dame", "Roi"};

        int y;
        Carte carteGagnant;
        for(int z = 0; z < couleur.length; ++z) {
            if (z == 0) {
                for(y = 0; y <= 12; ++y) {
                    carteGagnant = new Carte(couleur[z], valeur[y]);
                    paquetEntier[y] = carteGagnant;
                }
            } else if (z == 1) {
                for(y = 13; y <= 25; ++y) {
                    carteGagnant = new Carte(couleur[z], valeur[y - 13]);
                    paquetEntier[y] = carteGagnant;
                }
            } else if (z == 2) {
                for(y = 26; y <= 38; ++y) {
                    carteGagnant = new Carte(couleur[z], valeur[y - 26]);
                    paquetEntier[y] = carteGagnant;
                }
            } else if (z == 3) {
                for(y = 39; y <= 51; ++y) {
                    carteGagnant = new Carte(couleur[z], valeur[y - 39]);
                    paquetEntier[y] = carteGagnant;
                }
            }
        }

        List<Carte> paquetCarte = Arrays.asList(paquetEntier);
        Collections.shuffle(paquetCarte);
        paquetCarte.toArray(paquetEntier);

        for(y = 0; y < paquetEntier.length; ++y) {
            if (y < 26) {
                player1.addCard(paquetEntier[y], y);
            } else {
                player2.addCard(paquetEntier[y], y - 26);
            }
        }

        for(y = 0; y <= paquetP1.length; ++y) {
            Carte[] carteDejaTire = new Carte[52];
            Carte carteTireP1 = player1.pullCard();
            Carte carteTireP2 = player2.pullCard();

            for(int j = 0; j < carteDejaTire.length; ++j) {
                if (carteDejaTire[j] == carteTireP1 || carteDejaTire[j] == carteTireP2) {
                    System.out.println("JE TEST " + j);
                    carteTireP1 = player1.pullCard();
                    carteTireP2 = player2.pullCard();
                }
            }

            carteDejaTire[y] = carteTireP1;
            carteDejaTire[y + 1] = carteTireP2;
            carteGagnant = carteTireP1.meilleurCarte(carteTireP2);
            PrintStream var10000;
            String var10001;
            if (carteTireP1 == carteGagnant) {
                var10000 = System.out;
                var10001 = carteGagnant.getValeur();
                var10000.println("La carte gagnante est la celle du joueur 1 " + var10001 + carteGagnant.getCouleur());
                player1.setScore(1);
            } else {
                var10000 = System.out;
                var10001 = carteGagnant.getValeur();
                var10000.println("La carte gagnante est la celle du joueur 2 " + var10001 + carteGagnant.getCouleur());
                player2.setScore(1);
            }
        }

        if (player2.getScore() > player1.getScore()) {
            System.out.println("Le joueur gagnant est le joueur 1 avec " + player1.getScore() + " points");
        } else {
            System.out.println("Le joueur gagnant est le joueur 2 avec " + player2.getScore() + " points");
        }

    }
}
