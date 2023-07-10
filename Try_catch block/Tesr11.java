
package Try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Tesr11 {
    public static void main(String[] args){
        int x,y,z;
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        try{
            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y;
            System.out.println("Div is"+z);
        }
        catch(ArithmeticException  | InputMismatchException e){
            if(e instanceof ArithmeticException){
            System.out.println("can noy divide by zero");
            
        }
            else if(e instanceof InputMismatchException){
            System.out.println("please enter int value");
        }
        }
        System.out.println("end");
    }
    

    }

