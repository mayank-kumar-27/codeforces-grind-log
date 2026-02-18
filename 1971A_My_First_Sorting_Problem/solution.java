import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a= sc.nextInt(), b = sc.nextInt();
            System.out.print(b > a ? a + " " + b + "\n" : b + " " + a + "\n");
        }
        sc.close();
    }
}