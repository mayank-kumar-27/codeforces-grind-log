import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            int m = a[0];
            for (int i = 1; i < n; i++) m = Math.max(m, a[i] - a[i - 1]);
            System.out.println(Math.max(m, (x - a[n - 1]) * 2));
        }
        sc.close();
    }
}