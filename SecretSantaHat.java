/* 	Implementation of a Secret Santa Hat for Christams fun!
	Designed by Jose Cruz Arinaga
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class SecretSantaHat{
   ArrayList<String> hat;

   public SecretSantaHat(){
      hat = new ArrayList<String>();
   }

   // Adds a name to the hat
   public void add(String name){
      hat.add(name);
      System.out.println();
   }

   //Pulls a random name from the hat. If the hat is empty, displays a message
   public void pull(){
      if(hat.isEmpty())
         System.out.println("There are no more names in the hat.");

      else{
         int high = hat.size();
         int low = 0;
         int i = (int)(Math.random() * (high - low) + low);

         String name = hat.remove(i);
         System.out.println("You chose " + name);
         System.out.println();
      }
   }

   //Generates a random number in the range of [low, high)
   public int randomNum(int low, int high){
      return (int)(Math.random() * (high - low) + low);
   }

   //Displays options for the user
   public void display(){
      Scanner scan = new Scanner(System.in);

      System.out.print("Choose an option:\nAdd\nPull\nExit");
      System.out.println();
      String input = scan.nextLine().toLowerCase();

      if(input.equals("add")){
         System.out.print("Input a name to add to the hat: ");
         String name = scan.nextLine();

         add(name);
         display();
      }

      else if(input.equals("pull")){
         pull();
         display();
      }

      else if(input.equals("exit")){}

      else{
         System.out.println("Quit fucking around!");
         System.out.println();
         display();
      }
   }
}
