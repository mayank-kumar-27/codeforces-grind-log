import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            if ((a - 1) % 3 == 0 || (a + 1) % 3 == 0)  System.out.println("First");
            else System.out.println("Second");
        }
        sc.close();
    }
}