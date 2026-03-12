import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), c = 0, x = 1;
            while (true) { if (x % 3 != 0 && x % 10 != 3 && ++c == n) { System.out.println(x); break; } x++; }
        }
        sc.close();
    }
}