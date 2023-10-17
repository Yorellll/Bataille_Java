//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
public class Carte {
    private String[] couleur = new String[]{"Coeur", "Pique", "Carraux", "Trefle"};
    private String[] valeur = new String[]{"As", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf", "Dix", "Valet", "Dame", "Roi"};
    private String couleurCarte;
    private String valeurCarte;

    public Carte(String couleurI, String valeurI) {
        int i;
        for(i = 0; i < this.couleur.length; ++i) {
            if (this.couleur[i].equals(couleurI)) {
                this.couleurCarte = couleurI;
            }
        }

        for(i = 0; i < this.valeur.length; ++i) {
            if (this.valeur[i].equals(valeurI)) {
                this.valeurCarte = valeurI;
            }
        }

    }

    public void setCouleur(String color){this.couleurCarte = color;}

    public String getCouleur() {
        return this.couleurCarte;
    }

    public void setValeur(String value){this.valeurCarte = value;}

    public String getValeur() {
        return this.valeurCarte;
    }

    public void changeCard(String newValue, String newColor) {
        this.valeurCarte = newValue;
        this.couleurCarte = newColor;
    }

    public boolean sameCard(Carte testCarte) {
        boolean pareil = false;
        if (this.couleurCarte == testCarte.couleurCarte && this.valeurCarte == testCarte.valeurCarte) {
            pareil = true;
        }

        return pareil;
    }

    public Carte meilleurCarte(Carte testCarte) {
        int indexTestCarte = 0;
        int indexThis = 0;

        for(int i = 0; i < this.valeur.length; ++i) {
            if (this.valeurCarte.equals(this.valeur[i])) {
                indexThis = i;
            }

            if (testCarte.valeurCarte.equals(testCarte.valeur[i])) {
                indexTestCarte = i;
            }
        }

        if (indexThis > indexTestCarte) {
            return this;
        } else {
            return testCarte;
        }
    }
}
