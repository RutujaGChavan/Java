
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a number");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            System.out.println("Numer is Maximum");

        } else {
            System.out.println("Number is Minimum");
        }
    }

}
