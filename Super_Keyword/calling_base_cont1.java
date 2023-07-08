class A{
   int i;
    A(){
        i=10;
        System.out.println("Constructor without argument");
    }
    A(int x)
    {
        i=x;
        System.out.println("Constructor with argument");
    }
}
class B extends A{
    int i;
    B(){
        super( );
        i=20;
        System.out.println("In B");
    }
    void add(){
        System.out.println(i+super.i);
        
    }
}
public class calling_base_const1 {
    public static void main(String[] args){
        B ob=new B();
        ob.add();
    }
    
}
