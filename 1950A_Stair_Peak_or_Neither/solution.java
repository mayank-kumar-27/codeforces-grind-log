import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = -1;
        while (++i < n) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a < b && b < c) System.out.println("STAIR");
            else if (a < b && b > c) System.out.println("PEAK");
            else System.out.println("NONE");
        }
        sc.close();
    }
}