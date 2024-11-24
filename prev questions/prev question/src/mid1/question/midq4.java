
package mid1.question;

import java.util.Scanner;

public class midq4 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        String s=inp.nextLine();
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' ')
                System.out.println("");
            else
                System.out.print(s.charAt(i));
        }
    }
}
