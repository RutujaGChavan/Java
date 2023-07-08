abstract class Account2{
    void getcustinfo(){
        System.out.println("Get cust Info...........");
        
    }
    abstract void calculateInterest();
}
    class saving extends Account2{
        @Override
        void calculateInterest() {
            System.out.println("CalculateInterest of saving");
            
        }
    }
    class loan extends Account2{
       

        @Override
        void calculateInterest() {
           System.out.println("Calculate Interest of loan");

    }
    
}
      
public class Abstracy1_class {
    public static void main(String[] args){
        saving ob1=new saving();
        ob1.getcustinfo();
        ob1.calculateInterest();
        
        loan ob2=new loan();
        ob2.getcustinfo();
        ob2.calculateInterest();
    }

}

    

