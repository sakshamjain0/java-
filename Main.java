import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));


//        arr[0]=22;
//        arr[1]=11;
//        arr[2]=32;
//        System.out.println(arr[2]);
//        for (int i = 0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
////            System.out.print(arr[i] + " ");
//        }
////        for (int i = 0; i<arr.length; i++) {
////            System.out.print(arr[i] + " ");
////        }
//        System.out.println(Arrays.toString(arr));

    }
   static void change(int[] arr){
        arr[0]=20;
    }
}