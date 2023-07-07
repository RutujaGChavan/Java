import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] ages){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        String choice;
        do{
            System.out.println("Enetre 2 number");
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
            System.out.println("Addition is"+c);
            System.out.println("Do you want to contiune?(yes/no)");
            choice=sc.next();
        }
        while(choice.equals("yes"));
        
            
        }
    }

