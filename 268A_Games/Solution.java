import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h[] = new int[n], g[] = new int[n], c = 0;
        for (int i = 0; i < n; i++) { h[i] = sc.nextInt(); g[i] = sc.nextInt(); }
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) if (i != j && h[i] == g[j]) c++;
        System.out.println(c);
        sc.close();
    }
}