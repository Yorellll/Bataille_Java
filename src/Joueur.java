//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
public class Joueur {
    private Carte[] playerCard;
    private int Score;

    public Joueur(Carte[] personalPacket, int Score) {
        this.playerCard = personalPacket;
        this.Score = Score;
    }

    public void addCard(Carte cardToAdd, int cardNumber) {
        this.playerCard[cardNumber] = cardToAdd;
    }

    public Carte[] getPaquet() {
        return this.playerCard;
    }

    public void SetPlayerCard(Carte[] tabCard){this.playerCard = tabCard;}

    public Carte pullCard() {
        int rdmCardPull = (int)Math.round(Math.random() * (double)(this.playerCard.length - 1));
        return this.playerCard[rdmCardPull];
    }

    public int getScore() {
        return this.Score;
    }

    public void setScore(int pointAdd) {
        this.Score += pointAdd;
    }
}
