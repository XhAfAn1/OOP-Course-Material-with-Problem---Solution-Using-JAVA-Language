
package fall2022;

import java.util.Scanner;

public class midq5 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        String user=inp.nextLine();
        int a=1;
        for (int i = 0; i < user.length(); i++) {
            char c=user.charAt(i);
            if(!((c>'A' && c<'Z') || (c>'a' && c<'z')|| c=='$' || c=='@')){
                System.out.println("Invalid username 1");
                a=0;
                break;
            }
            
        }
        char c=user.charAt((user.length()-1));
        if(a==1 && !(c=='$' || c=='@')){
              System.out.println("Invalid username 2");
        }
        else
            System.out.println("Valid username");
        
        
    }
}
