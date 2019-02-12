import java.util.Scanner;
import java.util.Random;

public class hilo{
    public static void main(String[] args) {
        //generate random number
        Random random=new Random();
        int secretNum = random.nextInt(101);
        //System.out.println(secretNum);.... to know the secret number
        //get the user's guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a guess between 1 and 100: ");
        //loop 6 times
        for (int i = 1; i <= 6; i++) {
            int guess = input.nextInt();

          if (guess<secretNum) {
              System.out.println("Your guess is low");
          }
          else if(guess>secretNum){
              System.out.println("Your guess is high");
          }
          else if (guess == secretNum) {
           congrats();    
        }
    }// end of for loop
    System.out.println("Sorry, you lose, no more trials.");
}//end of method main
public static void congrats(){
    System.out.println("Congrats,your guess is correct");
    System.exit(0);
}//end of method congrats

} //end of class