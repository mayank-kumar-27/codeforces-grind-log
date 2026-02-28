import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int mx = 0, mn = 0;
        for (int i = 0; i < n; i++) if (a[i] > a[mx]) mx = i;
        for (int i = 0; i < n; i++) if (a[i] <= a[mn]) mn = i;
        int r = mx + (n - 1 - mn);
        if (mx > mn) r--;
        System.out.println(r);
        sc.close();
    }
}