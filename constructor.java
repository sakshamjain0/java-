import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class alzebra{
    int a;
    int b;


    alzebra(int x , int y){
        System.out.println("constructor of alzebra class called");
        a=x;
        b=y;
    }

    int add(){
        int ans = a+b;
        return ans;
    }

    int sub(){
        return a-b;
    }

    int mul(){
        return a*b;
    }
}


public class constructor {
    public static void main(String[] args) {
    alzebra obj = new alzebra(5,7);
     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
        System.out.print("sum is : ");
       int ans = obj.add();
        System.out.println(ans);

        System.out.println(obj.sub());
        System.out.println(obj.mul());

        alzebra obj2 = new alzebra(10,7);
        System.out.println(obj2.add());
        System.out.println(obj2.mul());

    }
}