
public class Commandline1 {
    public static void main(String[] args){
        if(args.length==2){
            System.out.println(args[0]);
            System.out.println(args[1]);
            
        }
        else{
            System.out.println("Please enter 2 values");
        }
    }
}
