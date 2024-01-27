import java.util.*;
import java.io.*;

public class P11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<Integer>();

        System.out.print("<");

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            for (int j = 0; j < K-1; j++) {
                queue.add(queue.poll());
            }
            System.out.print(queue.poll()+", ");
        }
        if (queue.size() == 1) {
            System.out.print(queue.peek());
            System.out.print(">");
        } 
    }
}