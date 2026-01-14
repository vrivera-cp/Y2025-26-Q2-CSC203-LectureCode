package Module2.Lecture1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public static final int RANK_MIN = 2;
    public final int RANK_MAX = 14;

    public static final String[] suits = {
            "♠️",
            "♥️",
            "♣️",
            "♦️",
    };

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        for (String suit : suits) {
            for (var rank = RANK_MIN; rank <= RANK_MAX; rank++) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.removeLast();
    }
}
