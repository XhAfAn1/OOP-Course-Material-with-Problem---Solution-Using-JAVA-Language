
package labproblem;
import java.util.Scanner;
public class LabProblem4 {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
        System.out.print("Options:\n0. USD to BDT\n1. BDT to USD\nChoose an option: ");
        int x = input.nextInt();
        double usd = 108.36;
        if (x==0){
            System.out.print("Enter USD amount: ");
            double m = input.nextInt();
            double bdt=m*usd;
            System.out.printf("%.4f USD = %.4f BDT\n",m,bdt);
        }
        else if (x==1){
            System.out.print("Enter BDT amount: ");
            double m = input.nextInt();
            double usdt=m/usd;
            System.out.printf("%.4f BDT = %.4f USD\n",m,usdt);
        }
        else
            System.out.print("Invalide option.\n");
    }
    
}
