import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class P2164 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 2; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() == 1) {
            queue.remove();
            int a = queue.remove();
            queue.add(a);
        }
        System.out.println(queue.peek());
    }
}