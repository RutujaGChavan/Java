class Student{
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
    public String getname(){
        return name;
        
    }
    public void setname(String name){
        this.name=name;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Student st=new Student();
        st.setID(100);
        st.setname("abc");
        
       int x=st.getId();
       String n=st.getname();
       System.out.println("Id:" +x);
       System.out.println("name:" +n);
       
        
    }
}
