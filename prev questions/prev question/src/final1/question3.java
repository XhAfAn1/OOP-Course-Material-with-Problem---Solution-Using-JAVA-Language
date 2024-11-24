
package final1;
import java.io.*;
import java.util.*;
public class question3 {
    public static void main(String[] args) throws Exception{
        Scanner inp=new Scanner(System.in);
        File file= new File("quiz.txt");
        try(PrintWriter w=new PrintWriter(file)){
            System.out.println("Enter the number of student");
            int std= inp.nextInt();
            for (int i = 0; i < std; i++) {
                System.out.println("Enter student ID and 3 quiz marks");
                int id=inp.nextInt();
                int q1=inp.nextInt();
                int q2=inp.nextInt();
                int q3=inp.nextInt();               
            w.println(id+" "+q1+" "+q2+" "+q3);
            }
            w.close();
        }
        try(Scanner r=new Scanner(file)){
            int bq1=0;
            int bq1id=0;
            int bq2=0;
             int bq2id=0;
            int bq3=0;
             int bq3id=0;
             int[] quiz=new int[3];
             double avg=0;
            while(r.hasNext()){
                int id=r.nextInt();
                quiz[0]=r.nextInt();
                quiz[1]=r.nextInt();
                quiz[2]=r.nextInt();
                if(quiz[0]>bq1){
                    bq1=quiz[0];
                    bq1id=id;
                }
                if(quiz[1]>bq2){
                    bq2=quiz[1];
                    bq2id=id;
                }
                if(quiz[2]>bq3){
                    bq3=quiz[2];
                    bq3id=id;
                }
                System.out.print("id :"+id+" "+" quiz1 "+quiz[0]+" quiz2 "+quiz[1]+" quiz3 "+quiz[2]+" ");
                Arrays.sort(quiz);
                avg=(double)(quiz[1]+quiz[2])/2;
                System.out.println("Average of best 2 mark is"+avg);
            }
            System.out.println("best quiz marks are: quiz 1 "+bq1+" by student: "+bq1id+" and quiz 2 "+bq2+" by student: "+bq2id+" and quiz 3 "+bq3+" by student: "+bq3id);
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    }
}
