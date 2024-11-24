
package fall2022;

import java.util.Scanner;

class Car{
    private String model;
    private int year;
    private int price;
    
    Car(){
        
    }
    Car(String s,int y, int p){
        model=s;
        year=y;
        price=p;
    }
    
    
    public void setModel(String s){
        model=s;
    }
    public void setYear(int a){
        year=a;
    }
    public void setPrice(int a){
        price=a;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public int getPrice(){
        return price;
    }
    
    
    String display(){
        String s="The car model is: "+model+" year: "+year+" price :"+price;
        return s;
    }
    boolean Equals(Car c1){
        if(price==c1.price)
            return true;
        else 
            return false;
    }
    
}


public class midq2 {
    public static void main(String[] args) {
    Car[] car=new Car[3];
    Car c1= new Car("dfdf",2000,500);
    Car c2= new Car("sdsds",2001,5000);
    
//    Scanner inp= new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//        car[i]= new Car();
//            System.out.println("input car model, year, price");
//            car[i].setModel(inp.next());
//            car[i].setYear(inp.nextInt());
//            car[i].setPrice(inp.nextInt());
//        }
        
        if(Compare(c1,c2)){
            System.out.println("price same");
        }
        else
            System.out.println("not same");
        
       
        
    }
    public static boolean Compare(Car c1, Car c2){
        if(c1.getPrice()==c2.getPrice())
            return true;
        else 
            return false;
    }
    
}
