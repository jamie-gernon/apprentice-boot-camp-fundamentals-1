package cards;

public class PlayingCardDeck {

    private final PlayingCard[] cards ;

    public PlayingCardDeck(){
        this.cards = new PlayingCard[52];
    }

    public PlayingCard[] getCards(){
        return this.cards;
    }
}
