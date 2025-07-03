import java.util.Scanner;

public class numpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 1;i<=r;i++){
            for (int j = 1;j<=c;j++){
                if(i+j==5 || j-i==3 || i==r){
                    System.out.print("*");
            }else {
                    System.out.print(" ");
                }

                }
            System.out.println();

            }

        }
    }
