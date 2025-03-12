package cards;

public interface Deck {

    void shuffle();

    String[] getCards();

    AnimalCard deal();
}
