class Student2{
    private int id;
    private String name;
    public Student2(int id,String name){
        this.id=id;
        this.name=name;
        
    }
    @Override
    public String toString(){
        return id+" " +name;
        
    }
}
public class Override1 {
    public static void main(String[] args){
        Student2 St=new Student2(100,"abc");
        System.out.println(St.toString());
        System.out.println(St);
    }
}
