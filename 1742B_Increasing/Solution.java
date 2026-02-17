import java.util.Scanner;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            boolean b = true;
            for (int i = 1; i < a; i++) if (arr[i] == arr[i - 1]) { b = false; break; }
            System.out.println(b ? "YES" : "NO");
        }
        sc.close();
    }
}