
package final2;
import java.util.*;
import java.io.*;

abstract class DataReader{
    abstract void ReadData(String fileName)throws Exception;
    abstract void WriteData() throws Exception;
    
}
class TextFile extends DataReader{
    int[] Filenumb=new int[100];
    int index=0;
    
    void ReadData(String fileName) throws Exception{
        File file= new File(fileName);
        Scanner r=new Scanner(file);
        while(r.hasNext()){
            Filenumb[index]=r.nextInt();
            index++;
        }
        r.close();
    }
    void WriteData() throws Exception{
         File file=new File("ExamTextFile.txt");
        PrintWriter w=new PrintWriter(file);
         for (int i = 0; i < index; i++) {
            w.print(Filenumb[i]+" ");
        }
         w.close();
         
    }
}

class BinaryFile extends DataReader{
    ArrayList<Integer> binarynum=new ArrayList<>();
     void ReadData(String fileName)throws Exception{
         File file = new File(fileName);
         DataInputStream r=new DataInputStream(new FileInputStream(file));
         while(r.available()!=0){
             binarynum.add(r.readInt());
         }
         r.close();
     }
     void WriteData() throws Exception{
//         DataOutputStream r=new DataOutputStream(new FileOutputStream("ExamBinaryfile.txt"));
//         for (int i = 0; i < binarynum.size(); i++) {
//            r.writeInt(binarynum.get(i));
//        }
//         r.close();
         for (int i = 0; i < binarynum.size(); i++) {
             System.out.print(binarynum.get(i)+" ");
         }
     }
}

public class q1 {
    public static void main(String[] args) throws Exception{
        try{
        TextFile textFile = new TextFile();
        textFile.ReadData("quiz.txt");
//            for (int i = 0; i < textFile.index; i++) {
//                System.out.print(textFile.Filenumb[i]+" ");
//            }
        textFile.WriteData();
        //System.out.println(textFile.Filenumb);
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            BinaryFile binaryFile=new BinaryFile();
            binaryFile.ReadData("quizbin.dat");
            //binaryFile.WriteData();
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
}
