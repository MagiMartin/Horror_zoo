import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Zoo{

  public static void main(String[] args){
      //declare
      Scanner input = new Scanner(System.in);
      Move snakemove = new Move(0,0);
      Move rabbitmove = new Move(9,9);
      Random rand = new Random();


      while (snakemove.getx() != rabbitmove.getx() || snakemove.gety() != rabbitmove.gety()){
        //snake move
        System.out.println("enter direction for snake");
        String direction = input.nextLine();
        snakemove.moveunit(direction);
        //rabbit random move
        System.out.println("rabbitmove");
        int n = rand.nextInt(4) + 1;
        String snakeDirection = rabbitmove.convertarray(n);
        rabbitmove.moveunit(snakeDirection);

        int xcheck = Math.abs(snakemove.getx() - rabbitmove.getx());
        int ycheck = Math.abs(snakemove.gety() - rabbitmove.gety());

          if(xcheck == 1 && ycheck == 1){
            System.out.println("Rabbit: aargh im getting eaten!");
          }
       }
   }
}
