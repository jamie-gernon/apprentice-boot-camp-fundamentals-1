package cards;

import static cards.Suit.mapToSuitName;

public class PlayingCardDeck {

    private final PlayingCard[] cards ;

    public PlayingCardDeck(){
        this.cards = new PlayingCard[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                this.cards[suit*13+faceValue] = new PlayingCard( faceValue, mapToSuitName(suit));
            }
        }
    }

    public PlayingCard[] getCards(){
        return this.cards;
    }
}
