
import java.util.Scanner;

public class P2475 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        // Math.pow(a, b)는 a를 b제곱한 값
        // Math.pow 는 double로 받아지기 때문에 int로 받아줘야함
        int sum1 =  (int) Math.pow(a, 2);
        int sum2 =  (int) Math.pow(b, 2);
        int sum3 =  (int) Math.pow(c, 2);   
        int sum4 =  (int) Math.pow(d, 2);
        int sum5 =  (int) Math.pow(e, 2);
        System.out.println(((sum1+sum2+sum3+sum4+sum5)%10));

    }
}
