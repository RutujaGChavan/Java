


import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        int x, y, z;
        System.out.println("Enter your choice(+,-,*,/)");
        choice = sc.next();
        System.out.println("Enter 2 number");
        x = sc.nextInt();
        y = sc.nextInt();
        switch(choice){
        
        
    

        case"+":
        z=x+y;
        System.out.println("Adddition is"+z);
        break;
        case"-":
        z=x-y;
        System.out.println("Substraction is"+z);
        break;
        
        case"*":
        z=x+y;
        System.out.println("multipication is"+z);
        break;
        
        case"/":
        z=x+y;
        System.out.println("division is"+z);
        break;
        default:
        System.out.println("Wrong choice");
        
        
    }
  
    }
}
