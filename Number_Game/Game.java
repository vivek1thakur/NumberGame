import java.util.Scanner;
import java.lang.Math;

 class cal
{
    static void func()
    {
          try {
             int answer = (int)(Math.random() * 100) + 1;
        int k = 5;
     Scanner input = new Scanner(System.in);
     System.out.println(" Thinking of a number between 1 and 100.");
        while (k > 0) 
        {
             System.out.println("Guess your number: ");
             int guess = input.nextInt();
             if (guess == answer) {
              System.out.println("Correct");

            } else if (guess > answer)
            {
              System.out.println("Too High");
            } else if(guess<answer)
            {
                System.out.println("Too Low");
            }
             k--;
             
        }
        System.out.println("Correct answer is: "+answer);
            
        } catch (Exception e) {
            System.out.println("Somthing went Wrong");
        }
    }
}

public class Game {
  public static void main(String[] args) {
    cal c = new cal();
    c.func();
    
    
  }
}
