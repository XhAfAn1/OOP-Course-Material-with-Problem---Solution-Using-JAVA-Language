
package Lab4;

public class problem1 {
    public static void main(String[] args) {
        int[][] m= new int[10][10];
        int[] lc=new int[4];
        int[] lr=new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j]=(int)(Math.random()*2);
            }
        }
        
        for (int i = 0; i < 4; i++) {
            int sum=0;
            for (int j = 0; j < 4; j++) {
                sum=sum+m[i][j];
                
            }
            lr[i]=sum;
        }
         for (int i = 0; i < 4; i++) {
            int sum=0;
            for (int j = 0; j < 4; j++) {
                sum=sum+m[j][i];
                
            }
            lc[i]=sum;
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+m[i][j]);
            }
            System.out.println();
        }
        int mr=lr[0];
        int mri=0;
        for (int i = 0; i < 4; i++) {
            if(mr<lr[i]){
                mr=lr[i];
                mri=i;
                
            }
        }
        System.out.println("The lergest row index :"+mri);
        
         int mc=lc[0];
        int mci=0;
        for (int i = 0; i < 4; i++) {
            if(mc<lc[i]){
                mc=lc[i];
                mci=i;
                
            }
        }
        System.out.println("The lergest colom index :"+mci);
    }
}
