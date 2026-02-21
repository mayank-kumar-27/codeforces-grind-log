import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                String r = sc.next();
                for (int j = 0; j < 8; j++) {
                    char c = r.charAt(j);
                    if (c != '.') sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}