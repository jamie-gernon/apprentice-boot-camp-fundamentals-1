package cards;

import java.util.ArrayList;
import java.util.List;

class AnimalDeck implements Deck {

    private final List<AnimalCard> cards;

    public AnimalDeck() {
        cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            AnimalCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public AnimalCard deal() {
        return cards.remove(0);
    }

    @Override
    public List<AnimalCard> getListOfCards() {
        return cards;
    }
}
