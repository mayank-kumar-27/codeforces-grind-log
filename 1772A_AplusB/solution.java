import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            char[] st = s.toCharArray();
            System.out.println(st[0] - '0' + st[2] - '0');
        }
        sc.close();
    }
}