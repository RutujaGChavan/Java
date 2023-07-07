
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        float a,r;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter radius of circle");
        r=sc.nextFloat();
        a=3.14f*r*r;
        System.out.println("Area is:"+a);
        
    }
    
}
