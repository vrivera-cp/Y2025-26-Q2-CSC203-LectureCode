package Module2.Lecture1;

public class Card {
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    private final int rank;
    private final String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    private String getRankString() {
        return switch (rank) {
            case JACK -> "Jack";
            case QUEEN -> "Queen";
            case KING -> "King";
            case ACE -> "Ace";
            default -> Integer.toString(rank);
        };
    }

    @Override
    public String toString() {
        return String.format("%s of %ss", getRankString(), suit);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Card card) {
            return rank == card.rank
                    && suit == null ? card.suit == null : suit.equals(card.suit);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 0;

        hash = hash * 31 + rank;
        hash = hash * 31 + (suit == null ? 0 : suit.hashCode());

        return hash;
    }
}
