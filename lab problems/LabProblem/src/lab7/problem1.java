package lab7;

import java.util.*;

abstract class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Calendar dateCreated;


    Account() {

    }

    Account(int id, double balance, double ir) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = ir;
        dateCreated = Calendar.getInstance();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterestAmount() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double b) {
        if (b <= balance) {
            balance = balance - b;
        } else {
            System.out.println("insuf money");
        }
    }

    public void deposit(double b) {
        balance = balance + b;
    }
    void display(){
        System.out.println("Account");
    }

    abstract double getOverdraft();

    abstract long getCreditcardno();

    abstract double getCreditBalance();

    abstract Calendar getExpireDate();
}

class CheckingAccount extends Account {

    private double overdraft;

    CheckingAccount() {

    }

    CheckingAccount(int id, double balance, double ir, double od) {
        super(id, balance, ir);
        overdraft = od;

    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double b) {
        if (b <= getBalance() - overdraft) {
            setBalance(getBalance() - b);
        } else {
            System.out.println("insuf money");
        }
    }

    @Override
    long getCreditcardno() {
        return 0;
    }

    @Override
    double getCreditBalance() {
        return 0;
    }

    public Calendar getExpireDate() {
        return null;
    }
void display(){
        System.out.println("checkingAccount");
    }
}

class SavingsAccount extends Account {

    private long creditcardno = creditCardgen();
    private Calendar expireDate;

    SavingsAccount() {

    }

    SavingsAccount(int id, double balance, double ir/*, Calendar expireDate*/) {
        super(id, balance, ir);
        this.expireDate = expireDate;
    }

    public long getCreditcardno() {
        return creditcardno;
    }

    public Calendar getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Calendar expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public double getCreditBalance() {
        return getBalance() * 3;
    }

    double getOverdraft() {
        return 0;
    }

    long creditCardgen() {

        long a = 0;
        for (int i = 0; i < 16; i++) {
            long b = ((long) (Math.random() * 9) + 1);
            a = a * 10;
            a = a + b;

        }
        return a;
    }
    void display(){
        System.out.println("savingAccount");
    }

}

public class problem1 {

    public static void main(String[] args) {
       ArrayList<Account> acc = new ArrayList<>();
//        Scanner inp = new Scanner(System.in);
//        System.out.println("Press (1) for creating a Checking Account\nPress (2) for creating a Savings Account");
//        int a = inp.nextInt();
//        if (a == 1) {
//            System.out.println("Input id, balance, annual interest rate, overdraft limit");
//            int id = inp.nextInt();
//            double bal = inp.nextDouble();
//            double ir = inp.nextDouble();
//            double od = inp.nextDouble();
//            CheckingAccount ckecingAcc = new CheckingAccount(id, bal, ir, od);
//
//            acc.add(ckecingAcc);
//        } else if (a == 2) {
//            System.out.println("Input id, balance, annual interest rate, credit card expire year");
//            int id = inp.nextInt();
//            double bal = inp.nextDouble();
//            double ir = inp.nextDouble();
//            int y = inp.nextInt();
//            Calendar ed = Calendar.getInstance();
//            ed.add(Calendar.YEAR, y);
//            SavingsAccount saveacc = new SavingsAccount(id, bal, ir, ed);
//            acc.add(saveacc);
//
//        }
//        for (int i = 0; i < acc.size(); i++) {
//            if (acc.get(i) instanceof CheckingAccount) {
//                System.out.println("This is a Checking Account:");
//                System.out.println("Account ID: " + acc.get(i).getId());
//                System.out.println("Date Created:" + acc.get(i).getDateCreated().getTime());
//                System.out.println("Current Balance: " + acc.get(i).getBalance());
//                System.out.println("Annual Interest Rate: " + acc.get(i).getAnnualInterestRate());
//                System.out.println("Monthly Interest Amount: " + acc.get(i).getMonthlyInterestAmount());
//                System.out.println("OverDraft Limit: " + acc.get(i).getOverdraft());
//            } else if (acc.get(i) instanceof SavingsAccount) {
//                System.out.println("This is a Savings Account:");
//                System.out.println("Account ID: " + acc.get(i).getId());
//                System.out.println("Date Created:" + acc.get(i).getDateCreated().getTime());
//                System.out.println("Current Balance: " + acc.get(i).getBalance());
//                System.out.println("Annual Interest Rate: " + acc.get(i).getAnnualInterestRate());
//                System.out.println("Monthly Interest Amount: " + acc.get(i).getMonthlyInterestAmount());
//                System.out.println("Credit Card Number: " + acc.get(i).getCreditcardno());
//                System.out.println("Card Expiry Date: " + acc.get(i).getExpireDate().getTime());
//                System.out.println("Credit Balance: " + acc.get(i).getCreditBalance());
//            }
//        }

            CheckingAccount c1=new CheckingAccount(1,100,2,20);
            CheckingAccount c2=new CheckingAccount(2,200,4,20);
            
            SavingsAccount a1= new SavingsAccount(3,300,5);
            SavingsAccount a2= new SavingsAccount(3,400,6);
            
            
            acc.add(c1);
            acc.add(c2);
            acc.add(a1);
            acc.add(a1);
        
            for (int i = 0; i < acc.size(); i++) {
            acc.get(i).deposit(200);
            acc.get(i).withdraw(50);
            acc.get(i).display();
    }

}}
