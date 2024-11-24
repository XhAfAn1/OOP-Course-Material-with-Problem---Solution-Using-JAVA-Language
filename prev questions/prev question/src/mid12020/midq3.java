
package mid12020;

public class midq3 {
    public static void main(String[] args) {
        String[] name={"Dave","Sakib","Eva","mira","rayan",};    
         int[] mid1={0,50,45,34,67};
         int[] mid2={0,34,34,42,56};
         int[] fina={0,45,77,11,34};
         int[] project={0,28,33,65,43};
        
         processExamData(name,mid1,"mid1");
         processExamData(name,mid2,"mid2");
         processExamData(name,fina,"final");
         processExamData(name,project,"project");
         
         
    }
    public static void processExamData(String[] n, int[] num,String exam){
        int max=num[0];
        int mi=0;
        for (int i = 0; i < num.length; i++) {
          if(max<num[i]){
              max=num[i];
              mi=i;
          }  
        }
        System.out.println(exam+" - Highest: "+n[mi]);
    }
}
