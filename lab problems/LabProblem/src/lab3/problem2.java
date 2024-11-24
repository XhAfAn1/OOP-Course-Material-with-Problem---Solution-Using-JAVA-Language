
package lab3;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] number= new int[100];
        int[] dup = new int[100];
            for(int i=0; ;i++){
            System.out.println("Enter value "+i);
            number[i]=input.nextInt();
            dup[number[i]]++;
            if(number[i]==0){
                break;
            }

        }
            System.out.println("The array is: ");
            for(int x: number){
                if(x!=0){
                System.out.print(" "+x);
                }
            }
            System.out.println("");
            for(int i=1;i<100;i++){
                if(dup[i]>0){
                    System.out.println(i+" is present "+dup[i]+" times");
                }
            }
    }
}
