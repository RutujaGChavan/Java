

class Demo3 {

    int i ;
    Demo3(int i){
        i=i;
    }

    void show() {
        
        System.out.println(i);
    }

}

public class global {

    public static void main(String[] args) {
        Demo3 ob1 = new Demo3(10);
        ob1.show();
    }

}
