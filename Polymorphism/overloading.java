class Demo5{
    void add(int x,int y){
        System.out.println("Int add function called");
        System.out.println(x+y);
    }
    void add(float x,float y){
        System.out.println("Float add function called!!!");
        System.out.println(x+y);
    }
}
public class overloading {
    public static void main(String[] args){
        Demo5 ob=new Demo5();
        ob.add(1.2f,2.3f);
        ob.add(100, 200);
    }
    
}
