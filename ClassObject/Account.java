
import java.util.Scanner;

class Account1 {

    int id;
    String name;
    int balance;
    Scanner sc = new Scanner(System.in);

    void createAccount1() {
        System.out.println("Enter id");
        id = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter initial balance");
        balance = sc.nextInt();
    }

    void deposite() {
        System.out.println("Enter amount to deposite:");
        int amt = sc.nextInt();
        balance = balance + amt;

    }

    void withdraw() {
        System.out.println("Enter amount to balance");
        int amt = sc.nextInt();
        balance = balance - amt;

    }

    void print() {
        System.out.println("******************");
        System.out.println("id" + id);
        System.out.println("name" + name);
        System.out.println("balance" + balance);
    }
}

public class Account {

    public static void main(String[] args) {
        Account1 c1 = new Account1();
        c1.createAccount1();
        Account1 c2=new Account1();
        c2.createAccount1();
        c2.deposite();
        c1.withdraw();
        c2.print();

    }

}
