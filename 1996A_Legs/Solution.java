import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), m = 0;
            m += a / 4;
            a = a % 4;
            m += a / 2;
            System.out.println(m);
        }
        sc.close();
    }
}