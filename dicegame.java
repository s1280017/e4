import java.util.Random;
import java.util.Scanner;

public class dicegame
{
   public static void main(String[] args) 
   {
       Random rand = new Random();
       int[] dice = new int[2];
       Scanner scanner = new Scanner(System.in);
       System.out.println("What is your name?");
       String name = scanner.next();
       System.out.println("Hello, "+name+"!");
       System.out.println("Rolling the dice...");
       for(int i=0 ; i<2 ; i++)
       {
        dice[i]=rand.nextInt(6)+1;
        System.out.println("Dice "+(i+1)+": "+dice[i]);
       }
       System.out.println("Total value: "+(dice[0]+dice[1]));
       if( dice[0]+dice[1]>=7 )
       System.out.println(name+" won!");
       else
       System.out.println(name+" lose!");
   } 
}