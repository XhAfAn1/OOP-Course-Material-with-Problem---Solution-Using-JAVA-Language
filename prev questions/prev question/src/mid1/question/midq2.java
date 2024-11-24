
package mid1.question;
import java.util.Date;
import java.util.Scanner;

class Account{
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dateCreated=new Date(); 

    Account(){
        
    }
    Account(int aid,double balan){
        id=aid;
        balance=balan;
        dateCreated= new Date();
    }
    public void setId(int a){
        id=a;
    }
    public void setBalance(double b){
        balance=b;
    }
    public void setAnnualIrate(double i){
        annualInterestRate=i;
    }
    
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualIrate(){
        return annualInterestRate;
    }
    public Date getDate(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    double getMonthlyInterest(){
        return (balance*getMonthlyInterestRate());
    }
    
    void withdraw(double a){
        balance=balance-a;
    }
    void deposite(double a){
        balance=balance+a;
    }
    
    
    
    
    
}

public class midq2 {
    public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
       /*
       int n=inp.nextInt();
       Account[] ac=new Account[n];
        for (int i = 0; i < n; i++) {
            ac[i]=new Account();
            System.out.println("Enter id and balance of acc no -"+i+"(id,balance) ");
            ac[i].setId(inp.nextInt());
            ac[i].setBalance(inp.nextDouble());
        }
        */
        
       Account a1= new Account(11,100);
       Account a2= new Account();
       a2.setId(22);
       a2.setBalance(200);
       
       a1.setAnnualIrate(5);
       a2.setAnnualIrate(5);
       
       if(CompareTo(a1,a2))
            System.out.println("Rate same");
       else
            System.out.println("Rate not same");
       
       if(Equals(a1,a2))
            System.out.println("Balance same");
       else
            System.out.println("Balance not same");
       
       
    }
    
    
    public static boolean CompareTo(Account a,Account b){
        if(a.getAnnualIrate()==b.getAnnualIrate())
            return true;
        else
            return false;
            
    }
    public static boolean Equals(Account a,Account b){
        if(a.getBalance()==b.getBalance())
            return true;
        else
            return false;
            
    }
    
    
}
