import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            int m = (23 - a) * 60 + (60 - b);
            System.out.println(m);
        }
        sc.close();
    }
}