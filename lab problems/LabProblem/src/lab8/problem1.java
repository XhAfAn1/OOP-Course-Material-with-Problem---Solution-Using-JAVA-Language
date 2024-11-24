
package lab8;

import java.util.Scanner;

class Calculator{
int a,b;
Calculator(){
    
}
Calculator(int a,int b){
    this.a=a;
    this.b=b;
}
void add(){
    try{
    if(a<0 || b<0){
        throw new ArithmeticException("negetive number ");
    }
    else 
            System.out.println(a+b);
        }
catch(ArithmeticException e){
    System.out.println(e);
    
}

}
void subtract(){
    try{
    if(a<0 || b<0){
        throw new ArithmeticException("negetive number entered");
    }
    else 
            System.out.println(a-b);
        }
catch(ArithmeticException e){
    System.out.println(e);
}
}
void mul(){
     try{
    if(a==0 || b==0){
        throw new ArithmeticException(" multiplied with zero ");
    }
    else 
            System.out.println(a*b);
        }
catch(ArithmeticException e){
    System.out.println(e);
}
}
void division(){
   try{
    if(a==0 || b==0){
        throw new ArithmeticException(" divided by zero ");
    }
    else 
            System.out.println(a/b);
        }
catch(ArithmeticException e){
    System.out.println(e);
}
}

}

public class problem1 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, y;
        System.out.print("Enter two integer to perform addition: ");
        try {
            x = Integer.parseInt(inp.next());
            y = Integer.parseInt(inp.next());
            Calculator a1 = new Calculator(x, y);
            a1.add();
        } catch (NumberFormatException e) {
            System.out.print(e);
        }
        System.out.print("Enter two integer to perform subtraction: ");
        try {
            x = Integer.parseInt(inp.next());
            y = Integer.parseInt(inp.next());
            Calculator a2 = new Calculator(x, y);
            a2.subtract();

        } catch (NumberFormatException e) {
            System.out.print(e);
        }
        System.out.print("Enter two integer to perform multiplication: ");
        try {
            x = Integer.parseInt(inp.next());
            y = Integer.parseInt(inp.next());
            Calculator a3 = new Calculator(x, y);
            a3.mul();

        } catch (NumberFormatException e) {
            System.out.print(e);
        }
        System.out.print("Enter two integer to perform division: ");
        try {
            x = Integer.parseInt(inp.next());
            y = Integer.parseInt(inp.next());
            Calculator a4 = new Calculator(x, y);
            a4.division();

        } catch (NumberFormatException e) {
            System.out.print(e);
        }

    

 

       
    }
    
}