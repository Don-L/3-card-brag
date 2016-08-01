import game.*;

import static org.junit.Assert.*;
import org.junit.*;

public class LogicianTest {

  Logician logician;
  ArrayList<Card> hand;
  ArrayList<Player> players;
  Card card1;
  Card card2;
  Card card3;

  @Test
  public void canDetectPrial(){
    Logician logician = new Logician();
    Card card1 = new Card(Suit HEARTS, Value THREE);
    Card card2 = new Card(Suit DIAMONDS, Value THREE);
    Card card1 = new Card(Suit SPADES, Value THREE);
    ArrayList<Card> hand = new ArrayList<Card>();
    Player player = new Player();
    player.setNumber(1);
    hand.add(card1);
    hand.add(card2);
    hand.add(card3);
    player.setHand(hand);
    ArrayList<Player> players = new ArrayList<Player>();
    players.add(player);

    assertEquals(2, twoOfClubs.getNumber());
  }

}
