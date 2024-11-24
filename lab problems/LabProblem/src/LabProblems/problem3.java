
package LabProblems;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
         System.out.print("Enter row number: ");
        int r = input.nextInt();
        System.out.print("Enter Column number: ");
        int c = input.nextInt();
        int[][] array = new int[r][c];
         int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("Enter value for row %d colom %d :",i+1,j+1);
                array[i][j]=input.nextInt();
                sum+=array[i][j];
            }
        }
        System.out.println("\nresult :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.printf("Sum of all element is :%d",sum);
    }
}