public class practice2{
    public static void main(String[]args) {
        // //program to print the first 50 odd numbers
        // int sum = 0;
        // int counter = 0; 
        // for(int i=1; i<100; i+=2 ){
        //         sum+=i;
        //         counter++;
        //     }
        // int average = sum/50;
        // System.out.println("Counter is " + counter);
        // System.out.println(average);

       //table(); 
       //largest();
    //    System.out.println(fibs(4));
        fib(10);
    }
    //to print multiplication table
    public static void table(){
        System.out.println("N\t4*N\t12*N");
        int i = 1;
        int four = 0;
        int twelve = 0;
        while (i<6) {
            four = 4 *i;
            twelve = 12 * i;
            System.out.println(i+"\t"+four+"\t"+twelve);
        i++;
        }//end of while loop

    }


    public static void largest(){
        int a = 6;
        int b = 31;
        int c = 4;
        int max = 0;

        if(b>=a && b>=c){
            max=b;
        }
        else if(a>=b && a>=c){
            max=a;
        }
        else if(c>=a && c>=b){
            max=c;
        }
        System.out.println(max);
    }
    //program to print out the nth fibonacci number
    public static int fibs(int n){

        if(n == 1 || n == 2){
            return 1;
        }else{
            int result = fibs(n-2) + fibs(n-1);
            return result;
        }
    }

    public static void fib(int n){

        if(n == 1 || n == 2){

            System.out.println(1);
        }else{
            int result = fibs(n-2) + fibs(n-1);
            System.out.println(result);
        }
    }
}//end of class