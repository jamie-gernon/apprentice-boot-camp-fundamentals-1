package cards;

public class Suit {

    private final String name;

    public Suit(int name) {
        this.name = mapToSuitName(name);
    }

    private String mapToSuitName(int name) {
        switch (name) {
            case 0:
                return "clubs";
            case 1:
                return "diamonds";
            case 2:
                return "hearts";
            case 3:
                return "spades";
            default: throw new IllegalArgumentException("Something went wrong " + name + "is not a valid suitName!");
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}