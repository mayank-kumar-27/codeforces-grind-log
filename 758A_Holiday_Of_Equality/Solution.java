import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int m = a[0], r = 0;
        for (int i = 1; i < n; i++) m = Math.max(m, a[i]);
        for (int i = 0; i < n; i++) r += m - a[i];
        System.out.println(r);
        sc.close();
    }
}