
package labproblem;
import java.util.Scanner;
public class LabProblem3 {
    public static void main(String[] args) {
    Scanner inp = new Scanner (System.in);
        System.out.print("Enter a, b, c: ");
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double  m= (b*b)-(4*a*c);
        if(m>0){
        double eq = Math.pow(m,0.5);
        double x1 = ((-b)+eq)/(2*a);
        double x2 = ((-b)-eq)/(2*a);
        System.out.printf("The equation has two roots %.6f and %.6f\n",x1,x2);
    }
        else if(m==0){
        double x = (-b)/(2*a);
        System.out.printf("The equation has one root %.6f\n",x);
        }
        else
           System.out.printf("The equation has no real roots\n"); 
        
    }
    
}
