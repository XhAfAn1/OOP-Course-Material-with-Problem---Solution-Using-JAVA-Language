
package fall2022;

public class midq6 {
    public static void main(String[] args) {
        double[][] m= {{1,2,3,4},{5,6.5,7,8},{9,10,11,12},{13,14,15,16}};
        
        System.out.println(sumMinorDiagonal(m));
    }
    public static double sumMinorDiagonal(double[][] m){
        double sum=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(i+j == ((m.length+1)-2))
            {
                sum += m[i][j];
            }
            }
        }
        return sum;
    }
}
