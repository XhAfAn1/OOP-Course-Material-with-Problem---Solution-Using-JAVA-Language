
package Lab4;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the dimension ");
        int n =inp.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter the value of row "+i+" column "+j+" : ");
                arr[i][j]=inp.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Sorting it by values in column: ");
        int s = inp.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i][s]<arr[j][s]){
                  int[] temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
            }
        }
        
         System.out.println("The "+n+"x"+n+" array after sort:");
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    }
