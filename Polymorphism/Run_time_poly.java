
class A2 {

    void read() {
        System.out.print("Read fron file");

    }
}

class B2 extends A2 {

    void read() {
        System.out.println("Read from USB drive");
    }
}

class C2 extends B2 {

    void read() {
        System.out.println("Read from network");
    }
}

class Run_time_poly {

    

   static void show(A2 r) {
        r.read();
    }

    public static void main(String[] args) {
        A2 ob1 = new A2();
        B2 ob2 = new B2();
        C2 ob3 = new C2();
        show(ob1);
        show(ob2);
        show(ob3);
    }

}
