
import java.util.Scanner;

public class onedarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] arr = new int[5];
        System.out.println("Enter array");
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("your choice");
        for (i = 0; i < 5; i++) {
            System.out.println(" "+arr[i]);
        }

    }

}
