package Module2.Lecture1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardMainImperative {
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    public static final int RANK_MIN = 2;
    public static int RANK_MAX = 14;

    public static final String[] suits = {
            "♠️",
            "♥️",
            "♣️",
            "♦️",
    };

    private static String getRankString(int rank) {
        return switch (rank) {
            case JACK -> "Jack";
            case QUEEN -> "Queen";
            case KING -> "King";
            case ACE -> "Ace";
            default -> Integer.toString(rank);
        };
    }

    public static void main(String[] args) {
        record Card(int rank, String suit) {}

        List<Card> cards = new ArrayList<>();
        for (String suit : suits) {
            for (var rank = RANK_MIN; rank <= RANK_MAX; rank++) {
                cards.add(new Card(rank, suit));
            }
        }

        Collections.shuffle(cards);

        Card card = cards.removeLast();

        System.out.printf("%s of %ss%n", getRankString(card.rank), card.suit);
    }
}
