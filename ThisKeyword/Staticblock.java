
class Demo {

    {

        System.out.println("Normal block");

    }

    static {
        System.out.println("Static block");

    }

    Demo() {
        System.out.println("In constructor");
    }
}

class Staticblock {

    public static void main(String[] args) {
        Demo ob1 = new Demo();
        Demo ob2 = new Demo();
        Demo ob3 = new Demo();
        
    }
}
