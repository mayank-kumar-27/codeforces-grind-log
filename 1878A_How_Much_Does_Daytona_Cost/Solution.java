import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), k = sc.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) arr[i] = sc.nextInt();
            boolean f = false;
            for (int i = 0; i < a; i++) if (arr[i] == k) { f = true; break; }
            System.out.println(f ? "YES" : "NO");
        }
        sc.close();
    }
}