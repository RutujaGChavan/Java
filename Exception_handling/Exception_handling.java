
import java.util.Scanner;

public class Exception_handling {

    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = x / y;
        System.out.println("Div is" + z);
        System.out.println("end");

    }

}
