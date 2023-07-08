
abstract class A3 {

    void show() {
        System.out.println("In A");
    }

    abstract void add(int x, int y);

    abstract void sub(int x, int y);
}

class B3 extends A3 {

    @Override
     void add(int x, int y)

    {
        System.out.println(x + y);
    }

    @Override
    void sub(int x, int y){

    System.out.println (x-y);


}

}
public class Abstract_class {

    public static void main(String[] args) {
        B3 ob = new B3();
        ob.show();
        ob.add(100, 200);
        ob.sub(90, 10);
    }

}
