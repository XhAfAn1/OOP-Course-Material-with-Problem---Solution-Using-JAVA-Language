
package final2;
class negetiveValueException extends Exception{
    negetiveValueException(){
    
}
    negetiveValueException(String s){
        super(s);
    }
}
class Calculator<T extends Number>{
    private T input1;
    private T input2;
    Calculator(){
        
    }
    Calculator(T i1,T i2) throws negetiveValueException{
        //if(Integer.parseInt((String) i1)<0 || Integer.parseInt((String) i2)<0){
          if(i1.doubleValue()<0 || i2.doubleValue()<0){  
            throw new negetiveValueException("negetive value");
        }
        input1=i1;
        input2=i2;
    }
        public void DisplayResult() {
        System.out.println("Addition Result: " + Add());
        System.out.println("Subtraction Result: " + Subtract());
        System.out.println("Multiplication Result: " + Multiply());
        System.out.println("Division Result: " + Division());
    }

    public T Add() {
        return (T) Double.valueOf(input1.doubleValue() + input2.doubleValue());
    }

    public T Subtract() {
        return (T) Double.valueOf(input1.doubleValue() - input2.doubleValue());
    }

    public T Multiply() {
        return (T) Double.valueOf(input1.doubleValue() * input2.doubleValue());
    }

    public T Division() {
        return (T) Double.valueOf(input1.doubleValue() / input2.doubleValue());
    }
    
    public String toString(){
        String s;
        s="number 1="+input1+" number2= "+input2;
        return s;
    }
}

public class q2and3 {
    public static void main(String[] args) {
        try{
        Calculator<Integer> c1=new Calculator <>(20,30);
        c1.DisplayResult();
        System.out.println(c1);
        
    }
    catch(Exception e){
            System.out.println("Error: " + e.getMessage());
}
}
}