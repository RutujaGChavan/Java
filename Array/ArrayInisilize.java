
import java.util.Scanner;

public class arrayinitionlization {

    public static void main(String[] args) {
        int i;
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("your choice");
        i=sc.nextInt();
        for (i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("addition is" + sum);
    }
}
