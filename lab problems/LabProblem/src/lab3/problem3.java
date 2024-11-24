
package lab3;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in); 
        System.out.println("Enter number ");
        int n=input.nextInt();
       int r,t=n;
       int sum=0;
  while(n>0){    
   r=n%10; 
   sum=(sum*10)+r;    
   n=n/10;    
  }  
 if(t==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
    }
}
