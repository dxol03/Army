import java.util.Scanner;

public class P2675 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        int T = sc.nextInt();

        
       
        for(int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();

            char[] ch = S.toCharArray();

            for (int j = 0; j < S.length(); j++){
                for (int u = 0; u < R; u++) {
                    System.out.print(ch[j]);
                }
            }
            System.out.println("");
         }
    }
}