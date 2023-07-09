
public class String_handling1 {
    public static void main(String[] args){
        
        
        // get length of stringbuffer
        StringBuffer sb=new StringBuffer("Hello World");
        System.out.println(sb.length());
        
        // get capacity of sb
        System.out.println(sb.capacity());
        
        
        //append data to end sb object
        System.out.println(sb);
        sb.append("ru");
        sb.append(1.2);
        System.out.println(sb);
        
        //delete it is used to delete content of sb object
        sb.deleteCharAt(1);
        //delete many charater
        sb.delete(1,7);
        System.out.println(sb);
        
        //reverse
        sb.reverse();
        System.out.println(sb);
        
        StringBuffer sb1=new StringBuffer("I JAVA");
        System.out.println(sb1);
        sb1.insert(2, "LIKE");
        System.out.println(sb1);
        
        //convert stringbuffer object to string
        String s4=sb1.toString();
        System.out.println(s4);
        
        //setchartat
        System.out.println(sb1);
       sb1.setCharAt(0,'1' );
       System.out.println(sb1);
    }
}
