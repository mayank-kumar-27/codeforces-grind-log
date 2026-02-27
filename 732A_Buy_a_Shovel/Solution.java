import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), r = sc.nextInt(), n = 1;
        while ((k * n) % 10 != r && (k * n) % 10 != 0) n++;
        System.out.print(n);
        sc.close();
    }
}