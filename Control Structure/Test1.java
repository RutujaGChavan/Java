
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enetr a number");
        a = sc.nextInt();
        b = a % 2;
        if (b == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

}
