
package labproblem.homework;
import java.util.Arrays;
import java.util.Scanner;

public class hw1 {
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
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<x;i++){
            System.out.printf("%d, ",arr[i]);
        }
    
    }
  
}
