
class A {

    int i;

    A() {
        i = 20;
        System.out.println("In A");
    }

    void show() {
        System.out.println("In show A");
    }
}

    class B extends A {

        int i;

        B() {
            i = 20;
            System.out.println("In B");
        }

        void show() {
            System.out.println("In show B");
        }

        void add() {
            System.out.println(i + super.i);
            show();
            super.show();
        }
    }



public class Super_Keyword {

    public static void main(String[] args) {
        B obj = new B();
        obj.add();
    }

}
