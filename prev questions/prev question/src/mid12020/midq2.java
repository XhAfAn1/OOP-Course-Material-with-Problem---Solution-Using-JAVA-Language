
package mid12020;

import java.util.Scanner;

public class midq2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int[] run= new int[11];
        int p=0,a=0,v=0;
        int pmax=0,amax=0,vmax=0;
        
        for (int i = 0; i < 11; i++) {
           run[i]=inp.nextInt();
        }
        
        for (int i = 0; i < 11; i++) {
            if(run[i]>=0 && run[i]<=30){
                p++;
                if(run[i]>pmax)
                    pmax=run[i];
            }
            
            if(run[i]>=31 && run[i]<=70){
                a++;
                if(run[i]>amax)
                    amax=run[i];
            }
            if(run[i]>=71){
                v++;
                if(run[i]>vmax)
                    vmax=run[i];
            }
                        
        }
        System.out.println("Very poor performance");
        System.out.println("Total: "+p+" max Run: "+pmax);
        System.out.println("Average performance");
        System.out.println("Total: "+a+" max Run: "+amax);
        System.out.println("Very poor performance");
        System.out.println("Total: "+v+" max Run: "+vmax);
    }
}
