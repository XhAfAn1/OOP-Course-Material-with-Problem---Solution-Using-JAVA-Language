
package mid2_fall22;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


class Customer{
    private int cusId;
    private String name;
    
    Customer(){
    
}
    Customer(int cusId,String name){
    this.cusId=cusId;
    this.name=name;
}
    public void setcusId(int cusId){
        this.cusId=cusId;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getcusId(){
        return cusId;
    }
    public String getname(){
        return name;
    }
    void display(){
        System.out.println("Customer ID: "+cusId+", Name: "+name);
    }
    
    
}
class teller{
    private int Id;
    private int slotId=0;
    private ArrayList<Customer> cus= new ArrayList<>();
    private Date date=new Date();
    
    teller(){
        
    }
    teller(int Id){
        this.Id=Id;
    }
    public void setId(int id){
        Id=id;
    }
    public Date getdate(){
        return date;
    }
    public int getSlotId(){
        return slotId;
        
    }
    public int getId(){
        return Id;
    }
    
    public void addCustomer(Customer c){
        if(slotId<10){
            cus.add(c);
            slotId++;
        }
        else
            System.out.println("No slot availavle");
    }
    void printAllcus(){
        for (int i = 0; i < cus.size(); i++) {
            cus.get(i).display();
        }
    }
    void display(){
        System.out.println("Teller ID: "+Id+" date: "+date+" total slot: "+slotId+" customers: "+cus);
        printAllcus();
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        ArrayList<Customer> customerList = new ArrayList<>();
        
        //testing and taking random 10 demo customer with loop
        for (int i = 1; i <= 11; i++) {
            System.out.println("Input customer id and name");
            int a=inp.nextInt();
            String b=inp.next();
            Customer customer = new Customer(a, b);
            customerList.add(customer);
        }

        teller t1 = new teller(1);

        for (int i = 0; i < 10; i++) {
            t1.addCustomer(customerList.get(i));
        }
        //for displaying teller info
        t1.display();
        
        
        //checking if we can add 11th customer in a teller's slot
        t1.addCustomer(customerList.get(10));
        
    }
}
