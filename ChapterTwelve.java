import javax.smartcardio.Card;

public class ChapterTwelve {

    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;
    private final int suit;
    
    // instance variables and constructors go here

    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    public ChapterTwelve(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /*
    public String toString() {
        String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
               "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String s = ranks[this.rank] + " of " + suits[this.suit];
        return s;
    }
    */

    public boolean equals(ChapterTwelve that) {
        return this.rank == that.rank && this.suit == that.suit;
    }

    public int compareTo(ChapterTwelve that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    public static void printDeck(ChapterTwelve[] deck) {
        for (int i = 0; i < deck.length; i ++) {
            System.out.println(deck[i]);
        }
    }

    public static void main(String[] args) {
        ChapterTwelve aceOfClubs = new ChapterTwelve(1, 0);
        // System.out.println(aceOfClubs);

        ChapterTwelve[] cards = new ChapterTwelve[52];
        int index = 0;
        for (int rank = 1; rank <= 13; rank ++) {
            for (int suit = 0; suit <= 3; suit ++) {
                cards[index] = new ChapterTwelve(rank, suit);
                index ++;
            }
        }

        printDeck(cards);
    }

}