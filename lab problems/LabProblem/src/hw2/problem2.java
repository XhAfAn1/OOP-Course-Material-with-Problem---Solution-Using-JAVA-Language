
package hw2;

import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         System.out.print("Enter row number: ");
        int r = inp.nextInt();
        System.out.print("Enter Column number: ");
        int c = inp.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("Enter value for array[%d][%d] :",i+1,j+1);
                arr[i][j]=inp.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
    }


    
}
