
import java.util.Scanner;

public class matrix2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr3 = {
            {10, 20, 30}, {40, 50, 60}, {70, 80, 90}
        };
        int i, j;
        System.out.println("matrix is:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" " + arr3[i][j]);
            }
            System.out.println("");
        }
    }

}
