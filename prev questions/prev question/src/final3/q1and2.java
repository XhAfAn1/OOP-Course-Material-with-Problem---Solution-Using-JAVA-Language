package final3;
 class Acc<T >{
     private T accInfo;  
     private double withdraw;
     private double deposit;
 Acc(){
     
 }
 Acc(T accInfo,double withdraw,double deposit)throws NegValueException{
     if(withdraw<0 || deposit<0){
         throw new NegValueException("Negative value is not accepted");
     }
     else{   
    this.accInfo=accInfo;
    this.withdraw=withdraw;
    this.deposit=deposit;
     }
 }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw)throws NegValueException {
        if(withdraw<0){
             throw new NegValueException("Negative value is not accepted");
        }
        else{
            this.withdraw = withdraw;}
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) throws NegValueException{
       if( deposit<0){
         throw new NegValueException("Negative value is not accepted");}
       else{
        this.deposit = deposit;}
    }

    
    
 void setAccI(T a){
     accInfo=a;
 }
 T getAccI(){
     return accInfo;
 }
 
 
 void display(){
     System.out.println("info="+accInfo+"withdraw="+withdraw+"deposit="+deposit);
 }


 }


class NegValueException extends Exception{
NegValueException(){
    
}
NegValueException(String s){
     super(s);
}
} 


public class q1and2 {
    public static void main(String[] args) {
       try{
           Acc<Integer> ob1=new Acc(2000,200,3000);
           ob1.display();
           Acc<Double> ob2=new Acc(30000.00,200,0);
           ob2.display();
       }
       catch(NegValueException e){
            System.out.println(e);
       }
    }
    
}
