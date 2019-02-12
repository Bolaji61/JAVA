import java.util.Scanner;
public class helloworld{
    public static void main(String[]args){
        final double PI = 3.142;
        // Circum circum = new Circum();
        // Radius radius = new Radius();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the radius of the cirle? : ");
        double radius = scanner.nextDouble();

        var a = 2 * PI * radius;
        // double circum2 = circum;
        System.out.println(a);

    } 
}