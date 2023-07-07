
class Demo {

    int i;
    int j;

    void Setij(int x, int y) {
        i=x;
        j=y;
    }

    void add() {
        System.out.println(i + j);

    }
}

public class Addingvariable {

    public static void main(String[] args) {
        Demo ob1 = new Demo();
        ob1.Setij(10, 20);
        Demo ob2 = new Demo();
        ob2.Setij(80, 90);
        ob1.add();
        ob2.add();
    }
}
