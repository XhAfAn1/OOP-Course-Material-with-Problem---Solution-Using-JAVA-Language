
package final1;
import java.io.*;
import java.util.*;
public class test {
    public static void main(String[] args) throws Exception{
        String a="sdsfs";
        File file= new File("test.txt");
        try{
            a=a+" dfdfd";
            a=a+" dfdf fdfdfd fdfd ";
       
       
        }
        catch(Exception e){
            System.out.println(e);
        }
        
                 try(PrintWriter w=new PrintWriter(file)){
                     w.print(a);
                     w.close();
            }
            
        
                }
    }

