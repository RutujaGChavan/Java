import java.util.Scanner;

public class whileloop1 {
    public static void main(String[] args){
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        i=1;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
