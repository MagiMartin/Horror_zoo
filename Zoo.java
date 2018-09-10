import java.util.Scanner;
import java.util.Random;

public class Zoo{

  public static void main(String[] args){
      //declare
      String direction;
      String snakeDirection;
      Scanner input = new Scanner(System.in);
      Move snakemove = new Move(0,0);
      Move rabbitmove = new Move(9,9);
      Random rand = new Random();


      while (snakemove.getx() != rabbitmove.getx() || snakemove.gety() != rabbitmove.gety()){
        //snake move
        System.out.println("enter direction for snake");
        direction = input.nextLine();
        snakemove.moveunit(direction);
        //rabbit random move
        System.out.println("rabbitmove");
        int n = rand.nextInt(4) + 1;
        snakeDirection = rabbitmove.convertarray(n);
        rabbitmove.moveunit(snakeDirection);

       }
   }
}
