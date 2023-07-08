interface A7{
void add(int x,int y);

}
interface B7{
    public abstract void sub(int x,int y);
}
class Demo implements B7{
@Override
    
    public void add(int x, int y) {
        System.out.println(x + y);
    }

    @Override
    public void sub(int x, int y) {
        System.out.println(x - y);
    }
}

public class Intetrface_Inheritance{

    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.add(100, 200);
        ob.sub(90, 10);
    }

}

