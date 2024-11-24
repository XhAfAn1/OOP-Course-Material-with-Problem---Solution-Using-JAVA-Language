
package lab8;


import java.util.Scanner;

public class problem3 {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       int[] a= new int[100];
        for (int i = 0; i < 100; i++) {
            a[i]=(int)(Math.random()*9)+1;
        }
        System.out.println("Enter the index number");
        int x=inp.nextInt();
//        try{
//            if(x<0 || x>=100){
//            throw new ArithmeticException("out of index");
//            }
//            else
//                System.out.println(a[x]);
//        }
        try{
            System.out.println(a[x]);
        }
            catch(Exception e ){
                    System.out.println(e);
                    }
        }
    }
    
