import java.util.Scanner;
import java.lang.Math;

public class Zoo{

   //declare variables
   private static int xcheck;
   private static int ycheck;
   private static String direction;
   private static String convertDirection;

  public static void main(String[] args){
      //make objects
      Scanner input = new Scanner(System.in);
      Animal snakemove = new Animal(0,0);
      Animal rabbitmove = new Animal(9,9);

      //while loop to keepr program runnning
      while (snakemove.getx() != rabbitmove.getx() || snakemove.gety() != rabbitmove.gety()){

        //rabbit random move
        System.out.println("rabbitmove");
        convertDirection = rabbitmove.convertarray();
        rabbitmove.moveunit(convertDirection);

        //snake move
        System.out.println("enter direction for snake");
        direction = input.nextLine();
        snakemove.moveunit(direction);

        //check too see if snake and rabbit are next top each other
        xcheck = Math.abs(snakemove.getx() - rabbitmove.getx());
        ycheck = Math.abs(snakemove.gety() - rabbitmove.gety());
        koordinatcheck();

       }
   }

   public static void koordinatcheck(){
     if(xcheck == 1 && ycheck == 1){
       System.out.println("Rabbit: aargh im getting eaten!");
     }
   }

}
