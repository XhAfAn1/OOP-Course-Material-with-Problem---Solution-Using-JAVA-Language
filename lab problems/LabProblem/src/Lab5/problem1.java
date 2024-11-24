
package Lab5;

import java.util.Scanner;

class icecream{
private String itype,icom;
private double iprice;

icecream() {
    
}
icecream(String t,String c,double p){
    itype=t;
    icom=c;
    iprice=p;
}

public void setType(String t){
    itype=t;
}
public void setCom(String c){
    icom=c;
}
public void setPrice(double p){
    iprice=p;
}
public String getType(){
    return itype;
}
public String getCom(){
    return icom;
}
public double getPrice(){
    return iprice;
}




void display(){
    System.out.printf("ice cream type is: %s , company name : %s , price: %.2f \n",itype,icom,iprice);
}

void equal(icecream a){
    if(iprice==a.iprice)
        System.out.println("both icecream have same price");
    else
        System.out.println("price not same");
}



}


public class problem1 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the number of icecream");
        int n=inp.nextInt();
        icecream[] ic=new icecream[n];
        
        for (int i = 0; i < n; i++) {
            ic[i]=new icecream();
            System.out.println("Enter value for icecream"+i+" ( Type, company, price)");
            ic[i].setType(inp.next()); 
            ic[i].setCom(inp.next());
            ic[i].setPrice(inp.nextDouble());
            inp.nextLine();                        
        }
         
        System.out.println("Enter the company name u want to search by");
        String c=inp.next();
        searchByCom(c,ic);
      
    }
    public static void searchByCom(String c,icecream[] a){
     int j=0;   
        for (int i = 0; i < a.length; i++) {
            if(c.equals(a[i].getCom())){
                a[i].display();
            j++;
            }
        }
        if(j==0)
            System.out.println("Not found");
        
    }
            
}
