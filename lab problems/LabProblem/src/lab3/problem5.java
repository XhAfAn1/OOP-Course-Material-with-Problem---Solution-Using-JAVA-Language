
package lab3;

public class problem5 {
    static void maximum(int [] arr){
        int max = arr[0];
        int in = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                in=i;
                max=arr[i];
            }
        }
        System.out.printf("\nThe highest element is %d with index of %d",max,in);
    }
    static void minimum(int [] arr){
        int min = arr[0];
        int in = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min){
                in=i;
                min=arr[i];
            }
        }
        System.out.printf("\nThe smallest element is %d with index of %d",min,in);
    }
    public static void main(String[] args) {
        int[] arr = new int[100];
        System.out.println("Random generated array :");
        for (int i=0;i<100;i++){
            int x =(int)(Math.random()*100);
            arr[i]=x;
            System.out.print(" "+arr[i]);
        }
        maximum(arr);
        minimum(arr);
    }
}
