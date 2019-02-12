import java.util.*;
public class practice{
    public static void main(String[] args) {
        // for(int j=1; j<=5; j++){
        //     for(int k=5;k>=j;k--) System.out.print(j);
        //     System.out.println();
        // for(int k=0; k<25 ;k+=2){

        // if(k%3==1) System.out.print(k +" ");
        // }
       // wizard(104);
        //int see=factorial(4);
        //System.out.println(see);

        System.out.print(arrayMax());
    }
    static void wizard(int x){
        System.out.print(x % 10);
        if((x/10)!=0) wizard(x/10);
        System.out.print(x%10);
    } 
    //factorial code
    static int factorial(int x){
        if(x==0){
          return 1;
        }
          else{ 
        int ans= x * factorial(x-1); 
        return ans;
        }
    }

    public static int arrayMax() {
        int[] arr = {1,2,4,12,121,421,12,1242,42,2,3,424,52332,232,12};
        int max = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(max < arr[i]){

                max = arr[i];
            }
        }


        return max;
        
    }
public static int arrayRecursion(){
    if( max < arr[i])[
        max=arr[i];
    ]
    
} 

}//end of class