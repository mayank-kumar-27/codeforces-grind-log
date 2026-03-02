import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), l = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), p = sc.nextInt(), nl = sc.nextInt(), np = sc.nextInt();
        int x = k * l, y = c * d, z = p / np;
        int t = x / nl;
        System.out.println(Math.min(t, Math.min(y, z)) / n);
        sc.close();
    }
}