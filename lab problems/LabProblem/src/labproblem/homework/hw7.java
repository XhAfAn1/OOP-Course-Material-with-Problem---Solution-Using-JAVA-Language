
package labproblem.homework;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class hw7 {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       Random random=new Random();
        int x,i,temp, ni;
        System.out.print("Enter the size of array:");
        x=input.nextInt();
        int[] arr= new int[x];
        for(i=0;i<x;i++){
            System.out.printf("Enter the value of position %d: ",i+1);
            arr[i]=input.nextInt();
        }
        System.out.println("Original array");
    		for(i=0;i<x;i++)
    		{
        		System.out.print(arr[i]+" ");
    		}
        System.out.println("\nShuffled array");
        for(i=0;i<x;i++){
            
            ni=random.nextInt(x);
            temp=arr[i];
            arr[i]=arr[ni];
            arr[ni]=temp;
        }
         //System.out.println(Arrays.toString(arr));
        for( i=0;i<x;i++){
           System.out.printf("%d, ",arr[i]);
       }
    }
    
}
