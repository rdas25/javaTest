import java.util.Random;

public class Deck {
    
    private Card[] cards;

    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int rank = 1; rank < 14; rank ++) {
            for (int suit = 1; suit < 5; suit ++) {
                cards[index] = new Card(rank, suit);
                index ++;
            }
        }
    }

    public String toString() {
        String result = "";

        for (Card card : cards) {
            result += card + "\n";
        }
        
        return result;
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        Random random = new Random();

        for (int i = 0; i < cards.length; i ++) {
            int randInt = random.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[randInt];
            cards[randInt] = temp;
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println(deck);
        deck.print();
    }

}