import java.util.*;

public class Dealer {

  int numberOfPlayers;
  ArrayList<Player> players;
  ArrayList<Card> deck;

  public Dealer(){
    deck = new ArrayList<Card>();
    players = new ArrayList<Player>();
  }

  public void setDeck(ArrayList<Card> deck){
    this.deck = deck;
  }

  public void receiveNumberOfPlayers(){
    System.out.println("How many players?");
    String input = System.console().readLine();
    int number = Integer.parseInt(input);
    setNumberOfPlayers(number);
  }

  public int getNumberOfPlayers(){
    return numberOfPlayers;
  }

  public void setNumberOfPlayers(int number) {
    this.numberOfPlayers = number;
  }

  public void createDeck(){
    for (Suit suit : Suit.values()) {
      for (Value value : Value.values()) {
        Card card = new Card(suit, value);
        deck.add(card);
      }
    }
    Collections.shuffle(deck);
    this.setDeck(deck);
  }

  public void createPlayers(){
    for (int i = 0; i < this.numberOfPlayers; i++) {
      ArrayList<Card> hand = new ArrayList<Card>();
      Player player = new Player();
      for (int j = 3*i; j < 3*i + 3; j++) {
        Card dealtCard = deck.get(j);
        hand.add(dealtCard);
        player.setNumber(i + 1);
        player.setHand(hand);
      }
      System.out.println(player);
      System.out.println(hand);
      players.add(player);
    }
  }

  // public void announceWinner() {
  //   Logician logician = new Logician(this.players);
  // }


}
