
package lab3;

import java.util.Scanner;

public class problem1 {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int x = input.nextInt();
        int[] score = new int[10]; 
        int i;
        for(i=0;i<x;i++){
              System.out.printf("Enter the score of student %d:",i);
              score[i]=input.nextInt();
    }
       int max=score[0];
        for(i=0;i<x;i++) {
                  if(max<score[i]){
                      max=score[i];
                  }
              }
        
              for(i=0;i<x;i++) {
                  if(score[i]>=(max-10)){
                     System.out.printf("Student %d score is %d and grade is A\n",i,score[i]); 
                  }
                 else if(score[i]>=(max-20)){
                     System.out.printf("Student %d score is %d and grade is B\n",i,score[i]); 
                  }
                   else if(score[i]>=(max-30)){
                     System.out.printf("Student %d score is %d and grade is C\n",i,score[i]); 
                  }
                   else if(score[i]>=(max-40)){
                     System.out.printf("Student %d score is %d and grade is D\n",i,score[i]); 
                  }
                  else
                       System.out.println("Student %d score is %d and grade is F\n");

              }

                  
    }
}
