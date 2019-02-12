import java.util.Scanner;
class cgpa {
    public static void main(String[ ] args){
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter your first course, A: ");
        // String A = scanner.nextLine();
        // System.out.println("Enter the number of units of course A: ");
        // int unitA = scanner.nextInt();
        // System.out.println("Enter your score in course A: ");
        // double scoreA = scanner.nextInt();


        // System.out.println("Enter your second course, B: ");
        // String B = scanner.nextLine();

        // System.out.println("Enter your third course, C: ");
        // String C = scanner.nextLine();

        // System.out.println("Enter your fourth course, D: ");
        // String D = scanner.nextLine();

        // System.out.println("Enter your fifth course, E: ");
        // String E = scanner.nextLine();

        // System.out.println("Enter your sixth course, F: ");
        // String F = scanner.nextLine();

        // System.out.println("Enter your seventh course, G: ");
        // String G = scanner.nextLine();

        // System.out.println("Enter your eigth course, H: ");
        // String H = scanner.nextLine();


        Student bolaji;
        bolaji = new Student();

        bolaji.introduction();
        bolaji.getGPA();
        bolaji.getCGPA();

    }


//Defining our classes

class Student {
    Scanner input = new Scanner(System.in);
    private float tgp;  //total grade points
    private float tnu;   //total number of units
    private float cgpa;  //cumulative grade points
    private float ctnu; //cumulative total number of units
    private float ctgp; 
    private int numOfSemesters;
    private int i = 1;
    private int currentYear = 0;
}

void introduction(){
    System.out.println("Welcome, how many years is your course of study?");
    int yearsOfStudy = input.nextInt();
    numOfSemesters = 2 * yearsOfStudy;
}

private float calcGPA(){
    System.out.println("Input the number of courses you are offering: ");
    int numOfCourses = input.nextInt();
    
    int counter = 0;
}

}