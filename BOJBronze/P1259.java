import java.io.*;

public class P1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }
            char[] ch = str.toCharArray();
            char[] rech = new char[ch.length];

            for (int i = 1; i <= ch.length; i++) {
                rech[ch.length-i] = ch[i-1];
            }

            for (int i = 0; i < ch.length; i++) {
                if (rech[i] != ch[i]) {
                    System.out.println("no");
                    break;
                } else {
                    if (i == ch.length-1) {
                        System.out.println("yes");
                        break;
                    }
                }
             }  
        }



}
}

