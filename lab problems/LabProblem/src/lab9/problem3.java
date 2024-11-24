
package lab9;
import java.io.*;
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) throws Exception {
      File file = new File("Lab9_1.txt");
        File filew= new File("Lab9_3.dat");
        try(Scanner input = new Scanner(file);
        DataOutputStream output = new DataOutputStream(new FileOutputStream(filew));){
            while(input.hasNextLine()){
                String x= input.nextLine();
                output.writeUTF(x);               
            }
        }
//        try(DataInputStream input= new DataInputStream(new FileInputStream(filew))){
//           while(input.available()!=0) {           
//                System.out.println(input.readUTF()+" ");
//            }
//            input.close();
//            
//            
//           
//        }
        catch(Exception e){
            System.out.println(e);
        }
       
}
}

