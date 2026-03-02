import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) arr[i] = sc.nextInt();
        int m = arr[0];
        for (int i = 1; i < 4; i++) if (arr[i] > m) m = arr[i];
        for (int i = 0; i < 4; i++) if (arr[i] != m) System.out.print(m - arr[i] + " ");
        sc.close();
    }
}