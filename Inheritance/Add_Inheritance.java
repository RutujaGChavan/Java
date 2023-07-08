
class A {

    int i;

    A() {
        i = 10;
        System.out.println("In A");
    }
}

class B extends A {

    int j;

    B() {
        j = 20;
        System.out.println("In B");
    }

    void add() {
        System.out.println("i+j");
    }
}

public class Add_Inheritance {

    public static void main(String[] args) {
        B ob = new B();
        ob.add();
    }

}
