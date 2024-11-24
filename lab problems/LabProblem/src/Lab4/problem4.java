
package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class problem4 {
        public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of elements you wanna sort: ");
        int n = inp.nextInt();
        String[] arr=new String[n];
        inp.nextLine();
        for(int i = 0;i<n;i++){
            System.out.print("Enter "+i+"th word: ");
            arr[i]=inp.nextLine();
        }
        
//            for (int i = 0; i < n; i++) {
//                char a=arr[i].charAt(0);
//                for (int j = i+1; j < n; j++) {
//                   char b=arr[j].charAt(0); 
//                    if(a>b){
//                        String temp= arr[i];
//                        arr[i]=arr[j];
//                        arr[j]=temp;
//                    }
//                }
//            }
        Arrays.sort(arr);
        System.out.println("In the lexicographical order: ");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);

        }
    }
    }
