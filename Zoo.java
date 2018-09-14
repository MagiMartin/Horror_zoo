import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Zoo{

   //declare
   private static int xcheck;
   private static int ycheck;
   private static int n;
   private static String direction;
   private static String convertDirection;

  public static void main(String[] args){
      //make objects
      Scanner input = new Scanner(System.in);
      Animal snakemove = new Animal(0,0);
      Animal rabbitmove = new Animal(9,9);
      Random rand = new Random();


      while (snakemove.getx() != rabbitmove.getx() || snakemove.gety() != rabbitmove.gety()){
        //snake move
        System.out.println("enter direction for snake");
        direction = input.nextLine();
        snakemove.moveunit(direction);
        //rabbit random move
        System.out.println("rabbitmove");
        n = rand.nextInt(4) + 1;
        convertDirection = rabbitmove.convertarray(n);
        rabbitmove.moveunit(convertDirection);

        xcheck = Math.abs(snakemove.getx() - rabbitmove.getx());
        ycheck = Math.abs(snakemove.gety() - rabbitmove.gety());

          if(xcheck == 1 && ycheck == 1){
            System.out.println("Rabbit: aargh im getting eaten!");
          }
       }
   }
}
