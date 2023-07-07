
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You can cast a vote");
        } else {
            System.out.println("You can not cast a vote");
        }
    }
}
