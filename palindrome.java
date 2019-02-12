import java.util.Scanner;
 public class palindrome{
     public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //  System.out.print("Enter a number: ");
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();    //number in string
        String newNumber = "";                   //new number that is a reverse

         //check if it is palindrome
         for(int i = number.length()-1; i>=0; i--){
            newNumber += number.charAt(i);           //newnumber is in string format
         }

        //check if the integer number is palindrome
        if(number.equals(newNumber)){
            System.out.println("True, this number is palindrome.");
        }
        else {
            System.out.println("False, this number is not palindrome.");
        }
    
         
     }
 }