package cards;

import static cards.Suit.mapToSuitName;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String[] result = new String[52];
        PlayingCardDeck cardDeck = new PlayingCardDeck();

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                cardDeck.getCards()[suit*13+faceValue] = new PlayingCard( faceValue, mapToSuitName(suit));
            }
        }

        int cardNumber = 0;
        for (PlayingCard card : cardDeck.getCards()) {
            String faceValueName;
            switch (card.faceValue){
                case 0: faceValueName = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValueName = Integer.toString(card.faceValue+1); break;
                case 10: faceValueName = "jack"; break;
                case 11: faceValueName = "queen"; break;
                case 12: faceValueName = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card.faceValue + "is not a valid faceValue!");
            }

            result[cardNumber] = faceValueName + " of " + cardDeck.getCards()[cardNumber].suit.name;
            cardNumber++;
        }

        return result;
    }
}
