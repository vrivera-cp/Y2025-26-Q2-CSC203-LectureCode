package Module2.Lecture1;

public class CardMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Card card = deck.draw();

        System.out.println(card);
    }
}
