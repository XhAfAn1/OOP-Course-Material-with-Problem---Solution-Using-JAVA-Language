
package lab8;

import java.util.Scanner;

class MyException extends Exception{
    MyException(){
        
    }
    MyException(String s){
        super(s);
    }
    
    
}

public class Product {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        Product product=new Product();
        
        System.out.print("Enter the Product weight: ");
        int a=inp.nextInt();
        product.ProductCheck(a);
        

    }
    public static void ProductCheck(int weight){
        try{
            if(weight<100){
            throw new MyException("Product is Invalid");
        }
        else
            System.out.println("Product weight: "+weight);
    }
    catch(MyException e){
            System.out.println(e);
}
    }
}
