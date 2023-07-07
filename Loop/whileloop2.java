import java.util.Scanner;

public class whileloop2 {
    public static void main(String[] args){
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Addition is"+sum);
        }
    }

