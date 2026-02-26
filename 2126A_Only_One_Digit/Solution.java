import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), r = 9;
            while (n > 0) {
                if (n % 10 < r) r = n % 10;
                n /= 10;
            }
            System.out.println(r);
        }
        sc.close();
    }
}