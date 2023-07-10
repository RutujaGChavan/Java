import java.util.Scanner;
public class Test8 {
    public static void main(String[] args){
        int x,y,z;
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        try{
            z=x/y;
            System.out.println("Div is"+z);
        }
        catch(ArithmeticException e){
             System.out.println("can not divide by zero");
        }
    System.out.println("end");
    }
}


    

        
           
