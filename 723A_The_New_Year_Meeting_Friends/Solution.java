import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int m = Math.max(a, Math.max(b, c)), n = Math.min(a, Math.min(b, c));
        System.out.println(m - n);
        sc.close();
    }
}