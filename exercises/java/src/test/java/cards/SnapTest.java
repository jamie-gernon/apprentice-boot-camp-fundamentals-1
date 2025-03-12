package cards;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SnapTest{

    @Test
    public void whenAnimalCardsAreEqual_snapShouldReturnTrue() {

        AnimalCard previousCard = new AnimalCard(Animal.LION);
        AnimalCard currentCard = new AnimalCard(Animal.LION);

        boolean result = previousCard.snap(currentCard);

        assertTrue(result);
    }

    @Test
    public void whenAnimalCardsAreNotEqual_snapShouldReturnFalse() {

        AnimalCard previousCard = new AnimalCard(Animal.LION);
        AnimalCard currentCard = new AnimalCard(Animal.GORILLA);

        boolean result = previousCard.snap(currentCard);

        assertFalse(result);
    }

    @Test
    public void testWhenOneCardIsAnimalAndOneIsPlayingCard_snapShouldReturnFalse() {

        AnimalCard previousCard = new AnimalCard(Animal.LION);
        PlayingCard currentCard = new PlayingCard(new Suit(2), 2);

        boolean result = previousCard.snap(currentCard);

        assertFalse(result);
    }

    @Test
    public void whenPlayingCardsAreEqual_snapShouldReturnTrue() {

        PlayingCard previousCard = new PlayingCard(new Suit(3), 2);
        PlayingCard currentCard = new PlayingCard(new Suit(2), 2);

        boolean result = previousCard.snap(currentCard);

        assertTrue(result);
    }

    @Test
    public void whenPlayingCardsAreNotEqual_snapShouldReturnFalse() {

        PlayingCard previousCard = new PlayingCard(new Suit(3), 2);
        PlayingCard currentCard = new PlayingCard(new Suit(2), 5);

        boolean result = previousCard.snap(currentCard);

        assertFalse(result);
    }
}