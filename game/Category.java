public enum Category {
  HIGH_CARD(1),
  PAIR(2),
  FLUSH(3),
  STRAIGHT(4),
  STRAIGHT_FLUSH(5),
  PRIAL(6);

  private final int number;

  Category(int number){
    this.number = number;
  }

  private int getNumber(){
    return this.number;
  }
}
