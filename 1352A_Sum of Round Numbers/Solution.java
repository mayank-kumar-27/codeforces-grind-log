import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), r = a, c = 0;
            while (a != 0) {
                if (a % 10 != 0) c++;
                a /= 10;
            }
            System.out.println(c);

            int p = 1000;
            while (p > 0) {
                if ((r / p) != 0) System.out.print((r / p) * p + " ");
                r %= p; p /= 10;
            }
            System.out.println();
        }
        sc.close();
    }
}