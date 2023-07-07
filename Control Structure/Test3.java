
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter a three number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("A is maximum");
        } else if (b > a && b > c) {
            System.out.println("B is maximum");
        } else {
            System.out.println("C is maximum");
        }
    }
}
