package labproblem.homework;

import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);  
        int x,i,temp,s;
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
        System.out.print("\nhow many indext u want to shift to right:");
        s=input.nextInt();

                
                for(int j=0;j<s;j++) {
    		temp=arr[x-1];
                
    		for(i=x-1;i>0;i--)
    		{
       	 		arr[i]=arr[i-1];
    		}
    		arr[0]=temp;
    }
    		System.out.printf("\nNew array after rotating by %d postion in the right direction\n",s);
    		for(i=0;i<x;i++)
    		{
       	 		System.out.print(arr[i]+" ");
    		}
  
    }
    
}
