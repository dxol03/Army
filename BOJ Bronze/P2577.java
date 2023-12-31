import java.util.Scanner;
import java.util.Arrays;

public class P2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a*b*c;

        String str = Integer.toString(sum);

        char[] ch = str.toCharArray();

        int[] arr;
        arr = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            arr[i] = Character.getNumericValue(ch[i]);
        } 

        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int sum8 = 0;
        int sum9 = 0;

        for (int u = 0; u < arr.length; u++) {
            if (arr[u] == 0) {
                sum0++;
            } else if (arr[u] == 1) {
                sum1++;
            } else if (arr[u] == 2) {
                sum2++;
            } else if (arr[u] == 3) {
                sum3++;
            } else if (arr[u] == 4) {
                sum4++;
            } else if (arr[u] == 5) {
                sum5++;
            } else if (arr[u] == 6) {
                sum6++;
            } else if (arr[u] == 7) {
                sum7++;
            } else if (arr[u] == 8) {
                sum8++;
            } else if (arr[u] == 9) {
                sum9++;
            } 
        }

        System.out.println(sum0);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        System.out.println(sum5);
        System.out.println(sum6);
        System.out.println(sum7);
        System.out.println(sum8);
        System.out.println(sum9);






    }
}