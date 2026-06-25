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

    public static int search(ChapterTwelve[] cards, ChapterTwelve target) {
        for (int i = 0; i < cards.length; i ++) {
            if (cards[i].equals(target)) {
                return i;
            }
        }
        
        return -1;
    }

    public static int binarySearch(ChapterTwelve[] cards, ChapterTwelve target) {
        int low = 0;
        int high = cards.length - 1;
        while (low <= high) {
            System.out.println(low + ", " + high);

            int mid = (low + high) / 2; // step 1
            int comp = cards[mid].compareTo(target);
    
            if (comp == 0) { // step 2
                return mid;
            } else if (comp < 0) { // step 3
                low = mid + 1;
            } else { // step 4
                high = mid - 1;
            }
        }
        
        return -1;
    }

    public static int binarySearch(ChapterTwelve[] cards, ChapterTwelve target, int low, int high) {
        if (high < low) {
            return -1;
        }

        int mid = (low + high) / 2; // step 1
        int comp = cards[mid].compareTo(target);

        if (comp == 0) { // step 2
            return mid;
        } else if (comp < 0) { // step 3
            return binarySearch(cards, target, mid + 1, high);
        } else { // step 4
            return binarySearch(cards, target, low, mid - 1);
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

        System.out.println(search(cards, new ChapterTwelve(1, 0)));
        System.out.println(binarySearch(cards, new ChapterTwelve(1, 0)));
        System.out.println(binarySearch(cards, new ChapterTwelve(1, 0), 0, cards.length - 1));
    }

}