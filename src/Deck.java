public class Deck extends CardCollection {
    public Deck(String label) {
        super(label);

        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck("Deck");
        deck.shuffle();

        Hand hand = new Hand("Hands");
        deck.deal(hand, 5);
        hand.display();

//        Hand drawPile = new Hand("Draw Pile");
//        deck.dealAll(drawPile);
//        System.out.printf("Draw Pile has %d cards. \n", drawPile.size());

    }
}
//    private Card[] cards;
    //        return sub;
    //        }
    //            sub.cards[i] = this.cards[low + i];
    //        for (int i = 0; i < sub.cards.length; i++) {
    //        Deck sub = new Deck(high - low + 1);
    //    public Deck subdeck(int low, int high) {
    //
    //    }
    //        }
    //            System.out.println(this.cards[i]);
    //        for (int i = 0; i < this.cards.length; i++) {
    //    public void print() {
    //
    //    }
    //        }
    //            }
    //                index++;
    //                this.cards[index] = new Card( rank, suit);
    //            for (int rank = 1; rank <= 13; rank++){
    //        for (int suit = 0; suit <= 3; suit ++) {
    //
    //        int index = 0;
    //        this.cards = new Card[52];
    //    public Deck() {
    //
    //    }
    //        this.cards = new Card[n];
//    public Deck(int n) {

//    }
//}
