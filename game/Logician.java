import java.util.*;

public class Logician {

  ArrayList<Player> players;
  ArrayList<Player> prials;
  ArrayList<Player> straight_flushes;
  ArrayList<Player> straights;
  ArrayList<Player> flushes;
  ArrayList<Player> pairs;
  ArrayList<Player> high_cards;
  // ArrayList<Card> hand;

  public Logician(ArrayList<Player> players){
    this.players = players;
  }

  // public String classifyHands(){
  //   for (int i = 0; i < players.size; i++) {
  //     Player player = this.players.get(i);
  //
  //   }
  // }

  public void checkForPrial(Player player){
    ArrayList<Card> hand = player.getHand();
    if (hand.get(0) == hand.get(1) && hand.get(1) == hand.get(2)) {
      this.prials.add(player);
    }
  }

  // public void confirmFlush(Player player){
  //   ArrayList<Card> hand = player.getHand();
  //   Suit suit1 = hand
  // }

}
