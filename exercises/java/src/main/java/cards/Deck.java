package cards;

import java.util.Collections;
import java.util.List;

public abstract class Deck {

    void shuffle(){
        Collections.shuffle(getListOfCards());
    }

    abstract String[] getCards();

    Card deal() {
        return getListOfCards().remove(0);
    }

    abstract List<? extends Card> getListOfCards();
}
