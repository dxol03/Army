import java.util.Scanner;

public class P11720 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String n = sc.next();

        int count = 0;

        char[] ch = n.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int a = Character.getNumericValue(ch[i]);
            count += a;
        }
        System.out.println(count);
        
    }
}
