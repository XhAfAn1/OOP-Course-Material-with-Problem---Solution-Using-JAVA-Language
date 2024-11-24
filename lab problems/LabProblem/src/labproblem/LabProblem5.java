
package labproblem;

import java.util.Scanner;

public class LabProblem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a point p,q: ");
        int p = input.nextInt();
        int q = input.nextInt();
        System.out.print("Enter the radius, r: ");
        int r = input.nextInt();
        System.out.print("Enter a point x,y: ");
        int x=input.nextInt();
        int y = input.nextInt();
        double d = Math.pow((((x-p)*(x-p))+(y-q)*(y-q)),0.5);
        if(d<=r)
            System.out.printf("Point (%d, %d) is inside of the circle.\n",x,y);
        else
            System.out.printf("Point (%d, %d) is outside of the circle.\n",x,y);
    }
    
}
