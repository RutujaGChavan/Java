

class Demo1 {

    int i;
    int j;

    Demo1(int x, int y) {
        i = x;
        j = y;
        
            System.out.println("Constructor with argument called!!");
        }

        void add()
        
             {
        System.out.println(i + j);
        }
    }

    public class constructor1 {

        public static void main(String[] args) {
            Demo1 ob1 = new Demo1(10, 20);
            Demo1 ob2 = new Demo1(30, 40);
            ob1.add();
            ob2.add();

        }

    }
