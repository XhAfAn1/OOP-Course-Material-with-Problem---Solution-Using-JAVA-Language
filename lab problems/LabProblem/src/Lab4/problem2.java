
package Lab4;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter Your Password: ");
        String pass= inp.nextLine();
        checkpass(pass);
        
    }
    
    
   static void checkpass(String p){
       
       int check=0;
       
    if(p.length()>=8)   
            check++;
   
    
    int a=0; char b;
       for (int i = 0; i < p.length(); i++) {
           b=p.charAt(i);
           if(b>='0' && b<='9')
              a++;
       }
    if(a>=2)
            check++;

        a=1;
       for (int i = 0; i < p.length(); i++) {
           b=p.charAt(i);
           if(!((b>='a' && b<='z') || (b>='A' && b<='Z') || (b>='0' && b<='9'))){             
              a=0;
           break;
           }    
       }
       if(a==1)
           check++;
      
      if(check==3)
           System.out.println("Valid Password");
      else
           System.out.println("Invalid Password");
}
   
}
