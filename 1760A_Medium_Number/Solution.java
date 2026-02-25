import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int m = Math.max(a, Math.max(b, c)), n = Math.min(a, Math.min(b, c));
            if (n < a && a < m) System.out.println(a);
            else if (n < b && b < m) System.out.println(b);
            else System.out.println(c);
        }
        sc.close();
    }
}