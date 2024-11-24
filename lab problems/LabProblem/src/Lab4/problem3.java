
package Lab4;

import java.util.Scanner;

public class problem3 {
        public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int[][] emp=new int[100][7];
        int[] total= new int[7];
        int[] id= new int[100];
        String[] day={"sun","mon","tue","wed","thu","fri","sat"};
        int n;
        System.out.println("Enter number of employ: ");
        n=inp.nextInt();
        for (int i = 0; i < n; i++) {
            int sum=0;
            id[i]=i;
            for (int j = 0; j < 7; j++) {
                 System.out.println("Enter the working hour of Employ "+i+" day "+day[j]+" :");
                 emp[i][j]=inp.nextInt();
                 sum=sum+emp[i][j];
            }
            total[i]=sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Employ "+i+" : ");
            for (int j = 0; j < 7; j++) {
                System.out.print(emp[i][j]+" ");
            }

            System.out.println("total :"+total[i]);
            System.out.println("");
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(total[i]<total[j]){
                  int temp=total[i];
                  total[i]=total[j];
                  total[j]=temp;
                  
                  int tid=id[i];
                  id[i]=id[j];
                  id[j]=tid;
                }
            }
            
        }
             for(int i=0;i<n;i++){
            System.out.println("Employee "+id[i]+" with "+total[i]+" hours of work in the week.");
        }

        
    }

}
