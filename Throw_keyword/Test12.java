
package Try_catch;

import java.util.Scanner;
public class Test12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two numers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a/b;
        try{
            if(b==0){
                       ArithmeticException ex;
                       ex=new ArithmeticException();
                       throw ex;
                       
            }
        }
        catch(ArithmeticException e){
            System.out.println("Can not divide by zero!!!");
        }
    }
    
}
