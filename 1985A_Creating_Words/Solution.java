import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            char[] a = s.toCharArray();
            char temp = a[0]; a[0] = a[4]; a[4] = temp;
            System.out.println(new String(a));
        }
        sc.close();
    }
}