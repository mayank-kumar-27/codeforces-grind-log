import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), c = 0, m = 0;
            while (n-- > 0) {
                if (sc.nextInt() == 0) c++;
                else { m = m > c ? m : c; c = 0; }
            }
            m = m > c ? m : c;
            System.out.println(m);
        }
        sc.close();
    }
}