import java.util.Scanner;
public class Readchar {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int p = sc.nextInt();
//        String q = sc.next();
//        System.out.print(p);
//        System.out.println(q);
////        System.out.println(!((1>3)||(1>2)));
//         Scanner sc = new Scanner(System.in);
//        System.out.println("enter no");
//         int no = sc.nextInt();
//         if(no%2==0) {
//             System.out.println("even");
//         }
//             else {
//                 System.out.println("odd");
//
//         }
//    }
//}

        02
        Scanner sc = new Scanner(System.in);

        System.out.println("enter age");
        int age = sc.nextInt();

        if (age <= 12) {
            System.out.println("child");
        } else if (age >= 12 && age < 18) {
            System.out.println("stud");
        } else {
            System.out.println("adult");
        }
    }
}

