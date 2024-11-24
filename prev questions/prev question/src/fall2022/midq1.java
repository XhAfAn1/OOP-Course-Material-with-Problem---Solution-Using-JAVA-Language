
package fall2022;

import java.util.Scanner;

public class midq1 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        double t=inp.nextDouble();
        int v=inp.nextInt();
        
        if(!(t>-58 && t<41)){
            System.out.println("The temperature is invalid");
        }
        else if(!(v>2)){
            System.out.println("The valocity is invalid");
        }
        
        else{
         double tw=(35.74+(0.62*t)-(35.75*Math.pow(v,0.16)));
            System.out.println("The wind chill index is "+tw);
        }
        
        
        
    }
}
