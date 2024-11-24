package LabProblems;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
         System.out.print("Enter row number: ");
        int r = input.nextInt();
        System.out.print("Enter Column number: ");
        int c = input.nextInt();
        int[][] array = new int[r][c];
        int[] rowArray=new int[r];
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
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=array[i][j];
            }
            rowArray[i]=sum;
        }
        int max=rowArray[0];
        int n = 0;
        for(int i = 0;i<r;i++){
            if(rowArray[i]>max){
                max=rowArray[i];
                n=i;
            }
        }
        System.out.printf("Row %d has the largest sum, which is: %d",n+1,rowArray[n]);
    }
    }

