class Demo9{
    int i;
    Demo9(int i){
        this.i=i;}
    void show(){
        System.out.println(i);
    }
}
class ThisKeyword{
    public static void main(String[] args){
        Demo9 ob1=new Demo9(10);
        ob1.show();
    }
}