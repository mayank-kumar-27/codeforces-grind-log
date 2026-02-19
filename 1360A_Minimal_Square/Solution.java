import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            long a = sc.nextInt(), b = sc.nextInt();
            long c = Math.max(a, b), d = Math.min(a, b);
            long s = Math.max(c, 2 * d);
            System.out.println(s * s);
        }
        sc.close();
    }
}