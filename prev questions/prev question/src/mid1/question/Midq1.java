
package mid1.question;

import java.util.Scanner;

public class Midq1 {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter book Number (9 digit)");
        String a=inp.nextLine();
        //int b=Integer.parseInt( a);
        Integer b=Integer.valueOf(a);

        int sum=0;
        int checksum=0;
        
        for (int i = 9; i >=0 ; i--) {
            sum=sum+(i*(b%10));
            b=b/10;
        }
        checksum=sum%11;
        if(checksum==10)
            System.out.println(a+"X");
        else
            System.out.println(a+checksum);
        
            
    }

    
    
}
