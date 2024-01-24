import java.io.*;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int count = 0;
        
        for (int i = 0; i < K; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a != 0) {
                stack.push(a);
            } else {
                stack.pop();
            }
        }
        while (stack.isEmpty() == false) {
            count += stack.pop();
        }
        System.out.println(count);
    }
}