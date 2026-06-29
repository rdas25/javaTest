public class Card {
    
    private final int rank;
    private final int suit;

    public static final String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public static final String[] suits = {null, "Hearts", "Diamonds", "Clubs", "Spades"};

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return ranks[rank] + " of " + suits[suit];
    }

    public boolean equals(Card that) {
        return this.rank == that.rank && this.suit == that.suit;
    }

    public int compare(Card that) {
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }

        return 0;
    }

    public int getRank() {
        return this.rank;
    }
    public int getSuit() {
        return this.suit;
    }

    public static void main(String[] args) {
        // Card card = new Card(1, 1);
        // System.out.println(card);

        Card[] cards = new Card[52];
        int index = 0;
        for (int rank = 1; rank < 14; rank ++) {
            for (int suit = 1; suit < 5; suit ++) {
                cards[index] = new Card(rank, suit);
                index ++;
            }
        }

        for (Card card : cards) {
            System.out.println(card);
        }
    }

}
