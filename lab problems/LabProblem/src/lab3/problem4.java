
package lab3;

import java.util.Scanner;

public class problem4 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int[] darr = new int[10];
         System.out.println("Enter Ten numbers: ");
         for (int i = 0; i < 10; i++) {
             arr[i]=input.nextInt();
         }
         int b=0;
         for (int i = 0; i < 10; i++) {
            int a=0;
             for (int x: darr){
                if(arr[i]==x){
                    a=1;
                    break;
                }                
            }
             if(a==0){
                darr[i]=arr[i];
                b++;
            }                          
         }
         
         for(int x:darr){
             //if(x!=0){
                 System.out.print(x+" ");
             //}
         }
     }
}

