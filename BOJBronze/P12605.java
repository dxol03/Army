import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;

public class P12605 {
    public static void main(String[] args) throws IOException {
        Stack<String> stack = new Stack<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            while (st.hasMoreTokens()) {
                stack.push(st.nextToken());
            }
            
            System.out.print("Case #"+ (int)(i+1) +":"+" ");
            while (stack.isEmpty() == false) {    
                System.out.print(stack.pop()+" ");
            }

            
        }
    }
}
