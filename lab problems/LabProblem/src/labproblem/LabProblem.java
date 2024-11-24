package labproblem;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class LabProblem {
//     public static void main(String[] args) {
//      
//         int[] mid1={12,20,30,40,50,60};
//         int[] mid2={12,34,34,42,56,34};
//         int[] fina={66,45,77,11,34,76};
//         int[] ct={87,28,33,65,43,45};
//         
//         System.out.println("highest mark of mid1 is"+max(mid1)+" and lowest mark of mid1 is"+min(mid1));
//         System.out.println("highest mark of mid2 is"+max(mid2)+" and lowest mark of mid2 is"+min(mid2));
//         System.out.println("highest mark of final is"+max(fina)+" and lowest mark of final is"+min(fina));
//         System.out.println("highest mark of ct is"+max(ct)+" and lowest mark of ct is"+min(ct));
//         
//     } 
//     public static int min(int[] a){
//        int max=a[0];
//         for (int i = 0; i < a.length; i++) {
//             if(max<a[i]){
//                 max=a[i];
//             }
//         }
//         return max;
//     }
//     public static int max(int[] a){
//         int min=a[0];
//         for (int i = 0; i < a.length; i++) {
//             if(min>a[i]){
//                 min=a[i];
//             }
//         }
//         return min;
//     }
    
//           public static void main(String[] args) {
//        // Define the two lists
//        
//        int[] list1 = {5, 2, 2, 1, 6};
//        int[] list2 = {2, 1, 6, 5, 2};
//        
//        // Check if the lists are identical
//
//        boolean areIdentical = checkIdentical(list1, list2);
//        
//        // Print the result
//        if (areIdentical) {
//            System.out.println("These 2 lists are identical");
//        } else {
//            System.out.println("These 2 lists are not identical");
//        }
//    }
//    
//    public static boolean checkIdentical(int[] list1,int[] list2) {
//        // Check if the lists have the same size
//        Arrays.sort(list1);
//        Arrays.sort(list2);
//        
//        if (list1.length != list2.length) {
//            return false;
//        }
//        
//        // Check if the elements at each index are equal
//        for (int i = 0; i < list1.length; i++) {
//            if (list1[i]!=(list2[i])) {
//                return false;
//            }
//        }
//        
//        return true;
//    }
//
//}
         public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int[] darr = new int[10];
         System.out.println("Enter Ten numbers: ");
         for (int i = 0; i < 10; i++) {
             arr[i]=input.nextInt();
         }

         for (int i = 0; i < 10; i++) {
            int a=0;
             for (int j=0;j<10;j++){
                if(arr[i]==darr[j]){
                    a=1;
                    break;
                }                
            }
             if(a==0){
                darr[i]=arr[i];

            }                          
         }
         
         for(int i = 0; i < 10; i++){
             if(darr[i]!=0){
                 System.out.print(darr[i]+" ");
             }
         }
     }
}