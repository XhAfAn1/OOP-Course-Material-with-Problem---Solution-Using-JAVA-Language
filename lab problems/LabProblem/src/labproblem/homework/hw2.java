
package labproblem.homework;
import java.util.Scanner;
import java.util.Arrays;
//import java.util.Random;

public class hw2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);  
        //Random random=new Random();
        int x;
        System.out.print("Enter the size of array:");
        x=input.nextInt();
        int[] arr= new int[x];
        for(int i=0;i<x;i++){
            arr[i]=(int)(Math.random() *100);
        }
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<x;i++){
            System.out.printf("%d, ",arr[i]);

        }
    }
    
}
