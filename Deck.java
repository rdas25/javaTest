import java.util.Random;

public class Deck {
    
    private Card[] cards;

    public Deck(int n) {
        this.cards = new Card[n];
    }

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

        System.out.println();
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

    public Deck splitFirst() {
        Deck subOne = new Deck(this.cards.length / 2);
        for (int i = 0; i < (this.cards.length / 2); i ++) {
            subOne.cards[i] = this.cards[i];
        }

        return subOne;
    }

    public Deck splitSecond(Deck subOne) {
        int index = 0;
        Deck subTwo = new Deck(this.cards.length - subOne.cards.length);
        for (int i = (this.cards.length / 2); i < this.cards.length; i ++) {
            subTwo.cards[index] = this.cards[i];
            index ++;
        }

        return subTwo;
    }

    public static Deck merge(Deck subOne, Deck subTwo) {
        Deck merged = new Deck(subOne.cards.length + subTwo.cards.length);
        int i = 0;
        int a = 0;
        int b = 0;

        while (a < subOne.cards.length && b < subTwo.cards.length) {
            if (subOne.cards[a].compare(subTwo.cards[b]) < 0) {
                merged.cards[i] = subOne.cards[a];
                i ++;
                a ++;
            } else {
                merged.cards[i] = subTwo.cards[b];
                i ++;
                b ++;
            }
        }

        while (a < subOne.cards.length) {
                merged.cards[i] = subOne.cards[a];
            i ++;
            a ++;
        }
        while (b < subTwo.cards.length) {
            merged.cards[i] = subTwo.cards[b];
            i ++;
            b ++;
        }

        return merged;
    }

    public Deck mergeSort() {
        if (this.cards.length <= 1) {
            return this;
        }

        Deck firstHalf = this.splitFirst();
        Deck secondHalf = this.splitSecond(firstHalf);

        firstHalf = firstHalf.mergeSort();
        secondHalf = secondHalf.mergeSort();

        return Deck.merge(firstHalf, secondHalf);
    } 

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.print();

        deck.shuffle();
        deck.print();

        Deck subOne = deck.splitFirst();
        Deck subTwo = deck.splitSecond(subOne);
        Deck merged = Deck.merge(subOne, subTwo);
        merged.print();

        Deck sorted = deck.mergeSort();
        sorted.print();
    }

}