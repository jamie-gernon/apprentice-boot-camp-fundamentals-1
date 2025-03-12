package cards;

import junit.framework.TestCase;

public class SnapTest extends TestCase {

    public void testWhenCardsAreEqual_snapShouldReturnTrue() {

        AnimalCard previousCard = new AnimalCard(Animal.LION);
        AnimalCard currentCard = new AnimalCard(Animal.LION);

        boolean result = previousCard.snap(currentCard);

        assertTrue(result);
    }

    public void testWhenCardsAreNotEqual_snapShouldReturnFalse() {

        AnimalCard previousCard = new AnimalCard(Animal.LION);
        AnimalCard currentCard = new AnimalCard(Animal.GORILLA);

        boolean result = previousCard.snap(currentCard);

        assertFalse(result);
    }

}