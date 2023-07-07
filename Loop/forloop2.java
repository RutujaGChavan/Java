import java.util.Scanner;
public class forloop2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int a,b,i,c=1;
        System.out.println("Enter a 2 number");
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=b;i++){
            c=c*a;
        }
        System.out.println(c);
        }
                
    }
    

