
package LabProblems;

import java.util.Scanner;

public class problem6 {
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
        System.out.println("\nresult :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
        int max=array[r-1][c-1];
        int a=r-1,b=c-1;
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                if(max<=array[i][j]){
                    max=array[i][j];
                    a=i;
                    b=j;
                }
            }

        }
        System.out.printf("The largest element is %d located in row %d & column %d",max,a+1,b+1);
        
    }
}
