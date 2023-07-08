
class student {

    private int Id;
    private String name;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class mark extends student {

    private int m1;
    private int m2;

    public int getm1() {
        return m1;
    }

    public void setm1(int m1) {
        this.m1 = m1;
    }

    public int getm2() {
        return m2;
    }

    public void setm2(int m2) {
        this.m2 = m2;
    }

}

class Result extends mark {

    void calculatAvg() {
        float Avg=(getm1()+getm2())/2;
        System.out.println("Average is " + Avg);

    }
}

public class Multilevel_Interheritance {

    public static void main(String[] args) {
        Result ob = new Result();
        ob.setId(1);
        ob.setName("abc");
        ob.setm1(90);
        ob.setm2(80);
        System.out.println(ob.getId());
        System.out.println(ob.getName());
        System.out.println(ob.getm1());
        System.out.println(ob.getm2());
        ob.calculatAvg();
    


       
}
        }
