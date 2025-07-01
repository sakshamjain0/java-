import java.util.Scanner;

public class bintodec {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int ans = 0;
         int pw =1;
         int c;

        while(n>0){
            c=(n%10)*pw;
            ans += c;
            pw*=2;
            n/=10;

        }
        System.out.println(ans);
    }
}
