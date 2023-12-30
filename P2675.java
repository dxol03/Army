import java.util.Scanner;

public class P2675 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        int T = sc.nextInt();

        
       
        for(int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();

            char[] ch = S.toCharArray();

            // j자리에 있는 ch배열을 R번 반복하여 프린트
            
            for (int j = 0; j < S.length(); j++){
                for (int u = 0; u < R; u++) {
                    System.out.print(ch[j]);
                }
            }
            System.out.println("");
         }
    }
}