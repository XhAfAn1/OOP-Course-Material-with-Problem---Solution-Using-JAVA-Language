
package mid12020;

import java.util.Scanner;

public class midq1 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter 3 side");
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c=inp.nextInt();
        boolean triangle=false;//int a=0;
        
        if(a<0 || b<0 || c<0)
            System.out.println("length cant be negetive");
        else if(a+b>=c || b+c>=a || c+a>=b){
            System.out.println("it is a triangle");
            triangle=true;// int a=1;
        }
        else
            System.out.println("not a triangle");
        
        if(triangle/*a==1*/){
            if(a==b && b==c){
                double area=(Math.pow(3,0.5)/4)*(a*a);
                double perimeter=3*a;
                System.out.println("Area :"+area+" and perimeter :"+perimeter);
            }
            else
                System.out.println("not equilateral");
        }
        
        
    }
}
