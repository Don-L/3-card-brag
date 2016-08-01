import java.util.*;

public class Player {

  int playerNumber;
  ArrayList<Card> hand;

  public void setNumber(int number) {
    this.playerNumber = number;
  }

  public void setHand(ArrayList<Card> hand) {
    this.hand = hand;
  }

  public ArrayList<Card> getHand() {
    return this.hand;
  }

  @Override
  public String toString(){
    return "PLAYER " + this.playerNumber + " HAS:";
  }

}
