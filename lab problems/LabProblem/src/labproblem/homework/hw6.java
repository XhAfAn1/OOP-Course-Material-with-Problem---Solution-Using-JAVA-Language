
package labproblem.homework;

import java.util.Scanner;


public class hw6 {
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
        int max=arr[x-1];
        int index=0;
        for(int i=x-1;i>0;i--){
            
            if(max<=arr[i]){
                max=arr[i];
                index=i;
            }
        }
     System.out.printf("Largest element is= %d at index %d\n",max,index+1);
    }
    
}
