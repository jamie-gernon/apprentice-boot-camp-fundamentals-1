package cards;

public class Suit {

    private final String name;

    public Suit(String name) {
        this.name = name;
    }

    public static Suit mapToSuitName(int name) {
        switch (name) {
            case 0:
                return new Suit("clubs");
            case 1:
                return new Suit("diamonds");
            case 2:
                return new Suit("hearts");
            case 3:
                return new Suit("spades");
            default: throw new IllegalArgumentException("Something went wrong " + name + "is not a valid suitName!");
        }
    }

    public String getSuitName() {
        return this.name;
    }
}
