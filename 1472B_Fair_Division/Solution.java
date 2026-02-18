import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), o = 0, t = 0;
            for (int i = 0; i < a; i++) {
                int x = sc.nextInt();
                if (x == 1) o++; else t++;
            }
            int sum = o + 2 * t;
            if (sum % 2 != 0) System.out.println("NO");
            else if (o == 0 && t % 2 != 0) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}
