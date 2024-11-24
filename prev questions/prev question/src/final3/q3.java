
package final3;
import java.util.*;
import java.io.*;
public class q3 {
     public static void main(String[] args) throws Exception {
        Scanner inp=new Scanner(System.in);
         File file=new File("std.txt");
         try(PrintWriter w=new PrintWriter(file)){
             
             for (int i = 0; i < 30; i++) {
                 System.out.println("Enter student id and their number of mid1 mid 2 final: ");
                 int id=inp.nextInt();
                 int mid1=inp.nextInt();
                 int mid2=inp.nextInt();
                 int fi=inp.nextInt();
                 
                 w.println(id+" "+mid1+" "+mid2+" "+fi);
             }
            w.close();
         }
        try(Scanner r=new Scanner(file)){
            int hm1Id=0;
            int hmid1=0;
            int hm2Id=0;
            int hmid2=0;
            int hmfId=0;
            int hmf=0;
            while(r.hasNext()){
                int id=r.nextInt();
                ArrayList<Integer>  mid=new ArrayList<>();
                mid.add(r.nextInt());
                mid.add(r.nextInt());
                mid.add(r.nextInt());
                System.out.println("Id= "+id+", mid1= "+mid.get(0)+", mid2= "+mid.get(1)+", final= "+mid.get(2));
             if(hmid1<mid.get(0)){
                hmid1= mid.get(0);
                hm1Id=id;
             }
              if(hmid2<mid.get(1)){
                hmid2= mid.get(1);
                hm2Id=id;
             }
               if(hmf<mid.get(2)){
                hmf= mid.get(2);
                hmfId=id;
             }
             
              
                
            }
            System.out.printf("Highest mark of mid1 got by std id %d score is : %d\n",hm1Id,hmid1);
            System.out.printf("Highest mark of mid 2 got by std id %d score is : %d:\n",hm2Id,hmid2);
            System.out.printf("Highest mark of final fot by std id %d score is : %d:\n",hmfId,hmf);
        }
    }
    
}
