
package hw2;

import java.util.Scanner;

public class problem5 {
     public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int r = inp.nextInt();
        System.out.print("Enter Column number: ");
        int c = inp.nextInt();
        int[][] arr= new int[r][c];
        int[] row=new int[r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("Enter value for array[%d][%d] :",i+1,j+1);
                arr[i][j]=inp.nextInt();
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }
            row[i]=sum;
        }
        int max=row[0];
        int n = 0;
        for(int i = 0;i<r;i++){
            if(row[i]>max){
                max=row[i];
                n=i;
            }
        }
        System.out.printf("Row %d has the largest sum, which is: %d",n+1,row[n]);
    }
}
