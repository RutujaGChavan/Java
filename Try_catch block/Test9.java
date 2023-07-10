package Try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            z = x / y;
            System.out.println("div is" + z);
        } catch (ArithmeticException e){
            
            
            System.out.println("can not divide by 0");
            }catch (InputMismatchException e) {
            System.out.println("please enter int value");

        }
            System.out.println("end");
        }

    }
