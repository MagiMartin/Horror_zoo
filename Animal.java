public class Animal{

  //Declare variables
  private int x;
  private int y;
  private String convertDirection;

   //constructor
  public Animal(int x, int y){
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
      convertDirection = rabbitstring[0];
    }else if (n == 2){
      convertDirection = rabbitstring[1];
    }else if (n == 3){
      convertDirection = rabbitstring[2];
    }else if (n == 4){
      convertDirection = rabbitstring[3];
    }else{
      System.out.println("error, ");
    }
    return convertDirection;
  }
  //loop til at move unit ud fra string input
  public void moveunit(String newDirection){

    if (newDirection.equals("left")){
      System.out.print("ryk venstre, ");
      x = (x - 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);

    }else if (newDirection.equals("down")){
      System.out.print("ryk ned, ");
      y = (y - 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);

    }else if (newDirection.equals("right")){
      System.out.print("ryk hoejre, ");
      x = (x + 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);

    }else if (newDirection.equals("up")){

      System.out.print("ryk op, ");
      y = (y + 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);

    }else{
      System.out.println("error");
    }
  }
}
