import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), r = 0;
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) arr[i] = sc.nextInt();
            int min = arr[0];
            for (int i = 0; i < a; i++) min = min > arr[i] ? arr[i] : min;
            for (int i = 0; i < a; i++) r += (arr[i] - min);
            System.out.println(r);
        }
        sc.close();
    }
}