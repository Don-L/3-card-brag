public class Runner {
  public static void main(String[] args){

    Dealer dealer = new Dealer();
    dealer.receiveNumberOfPlayers();
    dealer.createDeck();
    dealer.createPlayers();
    // dealer.announceWinner();
  }
}
