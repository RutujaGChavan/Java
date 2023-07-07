
import java.util.Scanner;

public class whileloop3 {

    public static void main(String[] ages) {
        int  n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }
}
