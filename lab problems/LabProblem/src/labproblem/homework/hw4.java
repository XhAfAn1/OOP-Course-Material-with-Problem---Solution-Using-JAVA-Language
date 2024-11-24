
package labproblem.homework;
import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);  
        int x;
        System.out.print("Enter the size of array:");
        x=input.nextInt();
        int[] arr= new int[x];
        for(int i=0;i<x;i++){
            System.out.printf("Enter the value of position %d: ",i+1);
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<x;i++){
            
            sum+=arr[i];
        }
     System.out.printf("Sum of all element is= %d \n",sum);
    }
}
