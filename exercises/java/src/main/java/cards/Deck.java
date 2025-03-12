package cards;

import java.util.Collections;
import java.util.List;

public abstract class Deck {

    void shuffle(){
        Collections.shuffle(getListOfCards());
    }

    abstract String[] getCards();

    abstract Card deal();

    abstract List<? extends Card> getListOfCards();
}
