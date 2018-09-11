public class Move{

  //Declare variable
  private int x;
  private int y;
  String direction;
  String snakeDirection;

   //constructor
  public Move(int x, int y){
    this.x = x;
    this.y = y;
  }
  //getx
  public int getx(){
    return x;
  }
  //gety
  public int gety(){
    return y;
  }
  //converter rabbit move int til string
  public String convertarray(int n){

    String[] rabbitstring = {"left","right","up","down"};
    if (n == 1){
      snakeDirection = rabbitstring[0];
    }else if (n == 2){
      snakeDirection = rabbitstring[1];
    }else if (n == 3){
      snakeDirection = rabbitstring[2];
    }else if (n == 4){
      snakeDirection = rabbitstring[3];
    }else{
      System.out.println("error, ");
    }
    return snakeDirection;
  }
  //loop til at move unit ud fra string input
  public void moveunit(String newDirection){

    if (newDirection.equals("left")){
      System.out.print("ryk venstre, ");
      x = (x - 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);
      direction = newDirection;

    }else if (newDirection.equals("down")){
      System.out.print("ryk ned, ");
      y = (y - 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);
      direction = newDirection;

    }else if (newDirection.equals("right")){
      System.out.print("ryk hoejre, ");
      x = (x + 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);
      direction = newDirection;

    }else if (newDirection.equals("up")){

      System.out.print("ryk op, ");
      y = (y + 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);
      direction = newDirection;

    }else{
      System.out.println("error");
    }
  }
}
