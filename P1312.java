import java.util.Scanner;


public class P1312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int n = sc.nextInt();
        
        double per = a/b;

        for (int i = 0; i < n; i++) {
            per*=10;
            
        }

        System.out.println((int)(per%10));

        
    }
}
