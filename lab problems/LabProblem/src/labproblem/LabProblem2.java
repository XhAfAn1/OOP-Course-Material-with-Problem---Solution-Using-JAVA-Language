
package labproblem;
import java.util.Scanner;
public class LabProblem2 {
     public static void main(String[] args) {
                Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int time=input.nextInt();
        int year=time/(365*60*24);
        int day=(time%(365*60*24))/(60*24);
        System.out.printf("%d minutes is approximately %d years and %d days\n",time,year,day);
    }
    }
    

