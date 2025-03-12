package cards;

import java.util.ArrayList;
import java.util.List;

public class PlayingCardDeck extends Deck {

    private final List<PlayingCard> cards;

    public PlayingCardDeck() {
        this.cards = new ArrayList<>(52);

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                int index = suit * 13 + faceValue;
                this.cards.add(index, new PlayingCard(new Suit(suit), faceValue));
            }
        }
    }

    @Override
    public String[] getCards() {
        String[] result = new String[52];
        for (int i = 0; i < 52; i++) {
            PlayingCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public List<PlayingCard> getListOfCards() {
        return cards;
    }
}