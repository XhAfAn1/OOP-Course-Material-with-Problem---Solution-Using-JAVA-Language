
package labproblem;
import java.util.Scanner;

public class LabProblem1{

public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number =");
        int a=input.nextInt();
        if((a%2==0 || a%3==0)&& !(a%2==0 && a%3==0))
            System.out.println("True\n");
        else
            System.out.println("False\n");
    }
}
