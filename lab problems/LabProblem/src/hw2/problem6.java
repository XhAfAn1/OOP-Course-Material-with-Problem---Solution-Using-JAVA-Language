
package hw2;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int r = inp.nextInt();
        System.out.print("Enter Column number: ");
        int c = inp.nextInt();
        int[][] arr= new int[r][c];
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
        int max=arr[r-1][c-1];
        int a=r-1,b=c-1;
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                if(max<=arr[i][j]){
                    max=arr[i][j];
                    a=i;
                    b=j;
                }
            }

        }
        System.out.printf("The largest element is %d present in row %d & column %d",max,a+1,b+1);
}
}