package cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck implements Deck {

    private final PlayingCard[] cards;

    public PlayingCardDeck() {
        this.cards = new PlayingCard[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                this.cards[suit*13+faceValue] = new PlayingCard(new Suit(suit), faceValue);
            }
        }
    }

    @Override
    public void shuffle() {
        List<PlayingCard> listOfCards = new ArrayList<>(Arrays.asList(cards).subList(1, 53));
        Collections.shuffle(listOfCards);
    }

    @Override
    public String[] getCards() {
        String[] result = new String[52];
        for (int i = 0; i < 52; i++) {
            PlayingCard card = cards[i];
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public AnimalCard deal() {
        return null;
    }
}