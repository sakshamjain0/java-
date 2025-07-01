import java.util.Scanner;

public class dectobin {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int ans = 0;
        int d =1;
        int r;
        while(n>0) {
            r = (n % 2) * d;
            ans += r;
            d *= 10;
            n /= 2;
        }
        System.out.println(ans);

    }

}
