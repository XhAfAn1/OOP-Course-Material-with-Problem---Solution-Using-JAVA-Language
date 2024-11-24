
package lab9;
import java.io.*;
import java.util.*;
public class problem1 {

    public static void main(String[] args) throws Exception {
        File file=new File("Lab9_1.txt");
//        if(file.exists()){
//            System.out.println("File already exists");
//            //System.exit(0);
//        }            
        try( PrintWriter w= new PrintWriter(file);){
       
            for (int i = 0; i < 100; i++) {           
                int a=(int)(Math.random()*100)+1;
                w.print(a+" ");
            }
        
        
        w.close();
        }
        try( Scanner read= new Scanner(file);){
       
            while(read.hasNext()){
                int a=read.nextInt();
                System.out.print(a+" ");
            }
        
        read.close();
        }
    catch(Exception e){
            System.out.println(e);
    }
  }
}

