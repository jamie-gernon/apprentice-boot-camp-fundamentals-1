package cards;

import java.util.Collections;
import java.util.List;

public abstract class Deck {

    public void shuffle() {
        Collections.shuffle(getListOfCards());
    }

    public Card deal() {
        return getListOfCards().remove(0);
    }

    abstract String[] getCards();

    abstract List<? extends Card> getListOfCards();
}