package cards;

import java.util.Collections;
import java.util.List;

public interface Deck {

    default void shuffle(){
        Collections.shuffle(getListOfCards());
    }

    String[] getCards();

    Card deal();

    List<? extends Card> getListOfCards();
}
