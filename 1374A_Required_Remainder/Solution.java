import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
            int k = n - n % x + y;
            if (k > n) k -= x;
            System.out.println(k);
        }
        sc.close();
    }
}