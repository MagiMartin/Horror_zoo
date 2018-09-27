import java.util.Random;

public class Animal{

  //Declare variables
  private int x;
  private int y;
  private String convertDirection;
  private int n;

  //make random object
  Random rand = new Random();

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

  //converter rabbit move fra random int til string
  public String convertarray(){

    this.n = rand.nextInt(4) + 1;

    String[] rabbitstring = {"left","right","up","down"};
    if (this.n == 1){
      convertDirection = rabbitstring[0];
    }else if (this.n == 2){
      convertDirection = rabbitstring[1];
    }else if (this.n == 3){
      convertDirection = rabbitstring[2];
    }else if (this.n == 4){
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
      this.x = (this.x - 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);
    }else if (newDirection.equals("down")){
      System.out.print("ryk ned, ");
      this.y = (this.y - 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);
    }else if (newDirection.equals("right")){
      System.out.print("ryk hoejre, ");
      this.x = (this.x + 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);
    }else if (newDirection.equals("up")){
      System.out.print("ryk op, ");
      this.y = (this.y + 1 + 10) % 10;
      System.out.println("staar i " + x + "," + y);
    }else{
      System.out.println("error, wrong input");
    }
  }
}
