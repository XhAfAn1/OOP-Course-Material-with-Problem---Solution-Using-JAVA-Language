package lab5;
//import java.util.Scanner;


class Fraction{
    private int numerator;
    private int denominator;
    Fraction(){
    
    }
    Fraction(int n, int d){
        numerator=n;
        denominator=d;
    }
    void setNumerator(int n){
        numerator=n;
    }
    void setDenominator(int d){
        denominator=d;
    }
     int getNumerator(){
        return numerator;
    }
    int getDenominator(){
        return denominator;
    }
    public String toString(){
        //String s="The Numerator is :"+numerator+", and the Denominator is :"+denominator;
        String s=numerator+"/"+denominator;
        return s;
    }

    public void add(Fraction a,Fraction b){
        denominator=a.getDenominator()*b.getDenominator();
        numerator=(a.getNumerator()*b.getDenominator())+(b.getNumerator()*a.getDenominator());
    }
    public void sub(Fraction a,Fraction b){
        denominator=a.getDenominator()*b.getDenominator();
        numerator=(a.getNumerator()*b.getDenominator())-(b.getNumerator()*a.getDenominator());
    }
    public void multiplication(Fraction a,Fraction b){
        denominator=a.getDenominator()*b.getDenominator();
        numerator=(a.getNumerator()*b.getNumerator());
    }
    public void division(Fraction a,Fraction b){
         denominator=a.getDenominator()*b.getNumerator();
        numerator=(a.getNumerator()*b.getDenominator());
    }
    
//    public void add(Fraction a){
//        int n,d;
//        d=a.getDenominator()*denominator;
//        n=(a.getNumerator()*denominator)+(numerator*a.getDenominator());
//        System.out.println("Sum of 2 Fraction is: "+n+"/"+d);
//    }
//
//    public void sub(Fraction a){
//         int n,d;
//         d=a.getDenominator()*denominator;
//         n=(a.getNumerator()*denominator)-(numerator*a.getDenominator());
//        System.out.println("Sub of 2 Fraction is: "+n+"/"+d);
//    }
//    public void multiplication(Fraction a){
//         int n,d;
//        d=a.getDenominator()*denominator;
//         n=a.getNumerator()*numerator;
//        System.out.println("multiplication of 2 Fraction is: "+n+"/"+d);
//    }
//    public void division(Fraction a){
//         int n,d;
//         d=a.getNumerator()*denominator;
//         n=a.getDenominator()*numerator;
//        System.out.println("Division of 2 Fraction is: "+n+"/"+d);
//    }
    
    
    
}




public class problem3 {
    public static void main(String[] args) {
    Fraction f1= new Fraction(1,4);
    Fraction f2= new Fraction(3,5);
    
    
        System.out.println("fraction1 is :"+f1.toString());
        System.out.println("fraction2 is :"+f2.toString());
    Fraction f3= new Fraction();
            
    f3.add(f1, f2);
        System.out.println("Sum :"+f3.toString()); 
    f3.sub(f1, f2);
        System.out.println("Sub :"+f3.toString()); 
    f3.multiplication(f1, f2);
        System.out.println("multiplication :"+f3.toString()); 
    f3.division(f1, f2);
        System.out.println("division : "+f3.toString());     
        
    }
}