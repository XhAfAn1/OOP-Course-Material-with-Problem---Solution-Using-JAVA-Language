
package lab9;
import java.io.*;
import java.util.*;
public class problem2 {

    public static void main(String[] args) throws Exception {
        File file= new File("Lab9_2.dat");
    
        try(DataOutputStream output= new DataOutputStream(new FileOutputStream(file))){
           for (int i = 0; i < 100; i++) {           
                int a=(int)(Math.random()*100)+1;
                output.writeInt(a);
            }
            output.close();
            
            
           
        }
        try(DataInputStream input= new DataInputStream(new FileInputStream(file))){
           while(input.available()!=0) {           
                System.out.print(input.readInt()+" ");
            }
            input.close();
            
            
           
        }
    catch(Exception e){
            System.out.println(e);
    }
  }
}

