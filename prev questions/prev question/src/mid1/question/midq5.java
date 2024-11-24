
package mid1.question;

public class midq5 {
         public static void main(String[] args) {
         String[] name={"mithila","riad","nandam","rayan","tripto","ayad"};    
         int[] mid1={0,100,100,100,100,100};
         int[] mid2={0,34,34,42,56,34};
         int[] fina={0,45,77,11,34,76};
         int[] ct={0,28,33,65,43,45};
         
 //        System.out.println("highest mark of mid1 is "+mid1[min(mid1)]+" name : "+name[min(mid1)] +" and lowest mark of mid1 is "+mid1[max(mid1)]+" name :"+name[max(mid1)]);
//         System.out.println("highest mark of mid2 is"+max(mid2)+" and lowest mark of mid2 is"+min(mid2));
//         System.out.println("highest mark of final is"+max(fina)+" and lowest mark of final is"+min(fina));
//         System.out.println("highest mark of ct is"+max(ct)+" and lowest mark of ct is"+min(ct));
        processExamResult("Mid1", name, mid1);
        processExamResult("Mid2", name, mid2);
        processExamResult("Final", name, fina);
        processExamResult("CT", name, ct);
     } 
    
         public static void processExamResult(String e,String[] n,int[] m){
             System.out.println("examName : "+e+" - Highest: " + n[max(m)] +"   Lowest: " +n[min(m)]);
         }
         
         
     public static int max(int[] a){
        int max=a[0];
        int n=0;
         for (int i = 0; i < a.length; i++) {
             if(max<a[i]){
                 max=a[i];
                 n=i;
             }
         }
         return n;
     }
     public static int min(int[] a){
         int min=a[0];
         int n=0;
         for (int i = 0; i < a.length; i++) {
             if(min>a[i]){
                min=a[i];
                n=i;
            }
         }
         return n;
     }
}
    
