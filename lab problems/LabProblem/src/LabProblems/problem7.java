
package LabProblems;

import java.util.Scanner;

public class problem7 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
         System.out.print("Enter row number: ");
        int r = input.nextInt();
        System.out.print("Enter Column number: ");
        int c = input.nextInt();
        int[][] array = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("Enter value for row %d colom %d :",i+1,j+1);
                array[i][j]=input.nextInt();
            }
        }
        System.out.println("\nBefore shuffle");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
     for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int a=(int)((Math.random())*r);
                int b=(int)((Math.random())*c);
                
                int temp = array[i][j];
                array[i][j]= array[a][b];
                array[a][b]=temp;
            }
        }
        
        System.out.println("After shuffle");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }   
    }
    
}


