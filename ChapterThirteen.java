import javax.smartcardio.Card;

public class ChapterThirteen {

    private Card[] cards;

    public ChapterThirteen() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit ++) {
            for (int rank = 1; rank <= 13; rank ++) {
                this.cards[index] = new Card(rank, suit);
                index ++;
            }
        }
    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    public ChapterThirteen subdeck(int low, int high) {
        ChapterThirteen sub = new ChapterThirteen(high - low + 1);
        for (int i = 0; i < sub.cards.length; i ++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    public static void main(String[] args) {
        // nothing
    }

}