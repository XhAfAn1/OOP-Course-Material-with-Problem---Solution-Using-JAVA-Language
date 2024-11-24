
package lab9;
import java.util.*;
import java.io.*;
class List implements Serializable{
    int Index=-1;
    int MaxSize;
    int[] Data= new int[10];
    List(){       
    }
    List(int maxsize){
        Data = new int[maxsize];
       
    }
    public void push(int x){
        Index++;
        Data[Index]=x;        
    }
    public void pop(){
        Data[Index]=0;
        Index--;
    }
    public int top(){
        return Data[Index];
    }
    public void display(){
        for (int i = 0; i <= Index; i++) {
            System.out.print(Data[i]+" ");
        }
        System.out.println(" ");
    }
}
public class problem4 {
    public static void main(String[] args)throws Exception {
        Random ran=new Random();
        File file = new File("Lab08_04.dat");
        File file1 = new File("asdad4.txt");
        List l1= new List(5);
        List l2= new List(5);
        List l3= new List(5);
        List l4= new List(5);
        List l5= new List(5);
        
        l1.push(ran.nextInt(10));
        l1.push(ran.nextInt(10));
        l1.push(ran.nextInt(10));
        
        l2.push(ran.nextInt(10));
        l2.push(ran.nextInt(10));
        l2.push(ran.nextInt(10));
        
        l3.push(ran.nextInt(10));
        l3.push(ran.nextInt(10));
        l3.push(ran.nextInt(10));
        
        l4.push(ran.nextInt(10));
        l4.push(ran.nextInt(10));
        l4.push(ran.nextInt(10));
        
        l5.push(ran.nextInt(10));
        l5.push(ran.nextInt(10));
        l5.push(ran.nextInt(10));
        

        try(
            FileOutputStream out= new FileOutputStream(file);
            ObjectOutputStream output = new ObjectOutputStream(out);
        ){
            output.writeObject(l1);
            output.writeObject(l2);
            output.writeObject(l3);
            output.writeObject(l4);
            output.writeObject(l5);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        try(
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream input= new ObjectInputStream(in);
        ){
            while (input.available()==0){
                try{
                List listl= (List)input.readObject();              
                    listl.display();                               
            }
                catch(Exception e){
                    break;
                }
            }
            
                
        }
         try( PrintWriter output= new PrintWriter(file1);){
       
            output.println(l1);
            output.println(l2);
             output.println(l3);
              output.println(l4);
               output.println(l5);
            
        
        
        output.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}