
import java.util.Scanner;

public class twodarray {

    public static void main(String[] args) {
        char ch;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new character");
        ch = sc.next().charAt(0);
        int x;
        x = ch;
        if (x > 65 && x <= 90) {
            System.out.println("capital");

        } else if (x >= 97 && x <= 122) {
            System.out.println("small");
        } else if (x >= 48 && x <= 97) {
            System.out.println("digit");
        }

    }

}
