import java.io.*;
import java.util.*;

public class P10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new LinkedList<>();
        for (int i = 0; i < N; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            if (st.nextToken().equals("push_front")) {
                deq.addFirst(Integer.parseInt(st.nextToken()));
            } else if (st.nextToken().equals("push_back")) {
                deq.addLast(Integer.parseInt(st.nextToken()));
            } else if (st.nextToken().equals("pop_front")) {
                if (deq.isEmpty()) {
                    System.out.println("-1");
                    break;
                } else {
                    deq.removeFirst();
                }
            } else if (st.nextToken().equals("pop_back")) {
                if (deq.isEmpty()) {
                    System.out.println("-1");
                } else {
                    deq.removeLast();
                }
            } else if (st.nextToken().equals("size")) {
                System.out.println(deq.size());
            } else if (st.nextToken().equals("empty")) {
                if (deq.isEmpty()) {
                    System.out.println("1");
                    break;
                } else {
                    System.out.println("0");
                }
            } else if (st.nextToken().equals("front")) {
                if (deq.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deq.getFirst());
                }
            }
        }
    }
}
