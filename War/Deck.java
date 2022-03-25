import java.util.*;

public class Deck {
  private ArrayList<Card> deck;

  public Deck() {
    // var = new ArrayList<Name>();
    this.deck = new ArrayList<Card>();

    for(int suit = 0; suit <= 3; suit++) {
      for(int value = 2; value <= 14; value++) {
        this.deck.add(new Card(value, suit));
      } // end inner for loop
    } // end outer for loop

  } // end constructor method

  public int getLength() {
    return deck.size();
  }

  public void Shuffle() {

    ArrayList<Card> shuffledDeck = new ArrayList<Card>();
    for (int i = 0; i < 52; i++){
      int r = (int)(Math.random() * (this.deck.size() - 1));
      shuffledDeck.add(this.deck.get(r));
      this.deck.remove(r);
    }
    this.deck = shuffledDeck();


    ArrayList<Card> sub1 = new ArrayList<Card>();
    ArrayList<Card> sub2 = new ArrayList<Card>();
    for (int i = 0; i < this.deck.size() / 2; i++){
      sub1.add(this.deck.get(i));
      sub2.add(this.deck.get(i + 26)));
    }

  }
  public void Deal(){
    ArrayList<Card> p1Cards = new ArrayList<Card();
    ArrayList<Card> p2Cards = new ArrayList<Card();

      while(this.deck.size > 0){
        p1Cards.add(this.deck.size.remove());
        p2Cards.add(this.deck.size.remove());
      }
  }

  public void displayDeck() {
    for(Card c : this.deck) {
      System.out.println(c);
    }
  }







} // end class
