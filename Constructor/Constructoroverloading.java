package classesobjects;

class Demo2 {

    int i;
    int j;

    Demo2(int x, int y) {
        i = x;
        j = y;
        System.out.println("Constructor with argument called!!");
    }

    Demo2() {
        i = 10;
        j = 20;
        System.out.println("Constructor without argument called!!");
    }

    void add() {
        System.out.println(i + j);
    }

}

public class Constructoroverloading {

    public static void main(String[] args) {
        Demo2 ob1 = new Demo2();
        Demo2 ob2 = new Demo2();
        ob1.add();
        ob2.add();
    }

}
