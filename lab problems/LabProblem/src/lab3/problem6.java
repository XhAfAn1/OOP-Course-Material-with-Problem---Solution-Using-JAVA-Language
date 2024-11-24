
package lab3;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Input the number of Student :");
        int x=input.nextInt();
        String[] std = new String[100];
        int [] scr = new int[100];
        for (int i = 0; i < x; i++) {
            System.out.printf("Enter the Name of Student %d :",i+1);
            input.nextLine();
            std[i]=input.nextLine();
            System.out.printf("Enter the score of Student %d :",i+1);
            scr[i]=input.nextInt();
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = i+1; j < x; j++) {
                if(scr[i]<scr[j]){
                    int temp = scr[i];
                    scr[i]=scr[j];
                    scr[j]=temp;
                    
                    String tempN= std[i];
                    std[i]=std[j];
                    std[j]=tempN;
                }
            }
        }
        
        for (int i=0;i<x;i++){
            System.out.println("name: "+std[i]+"\t Number: "+scr[i]);
        }
    }
}
