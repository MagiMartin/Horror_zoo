import java.util.Random;

public class Animal{

  //Declare variables
  private int x;
  private int y;
  private String convertDirection;
  private int n;

  //make random object
  Random rand = new Random();

  //constructor with (x,y) initial values
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

  //Convert rabbit move input from random int to string
  public String convertarray(){
      
    //Gives random number between 1-4
    this.n = rand.nextInt(4) + 1;

    //Array with String directions so we can convert the int
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

  //If-statements to alter the x and y coordinates of the animals
  public void moveunit(String newDirection){
    if (newDirection.equals("left")){
      //Use modulus to make floating edge conditions take the least significant digit after division
      this.x = (this.x - 1 + 10) % 10;
      System.out.println("Move left, i am now located in " + x + "," + y);
    }else if (newDirection.equals("down")){
      this.y = (this.y - 1 + 10) % 10;
      System.out.println("Move down, i am now located in " + x + "," + y);
    }else if (newDirection.equals("right")){
      this.x = (this.x + 1 + 10) % 10;
      System.out.println("Move right, i am now located in " + x + "," + y);
    }else if (newDirection.equals("up")){
      this.y = (this.y + 1 + 10) % 10;
      System.out.println("Move up, i am now located in " + x + "," + y);
    }else if (newDirection.equals("q")){
      System.out.println("Goodbye!" );
      System.exit(0);
    }else{
      System.out.println("error, wrong input");
      System.out.println("");
    }
  }
}
