import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,max;
        System.out.println("Enetr 2 number");
        a=sc.nextInt();
        b=sc.nextInt();
        max=a>b?a:b;
        System.out.println(("max value is"+max));
                
    }
    
}
