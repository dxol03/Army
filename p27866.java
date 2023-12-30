import java.util.Scanner;

public class p27866 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    int i = sc.nextInt();
    
    // s.charAt(6) 문자열(String)의 6번째 자리수를 char 형식으로 받아옴
    char ch = s.charAt(i-1);

    
    System.out.println(ch);
  }
}