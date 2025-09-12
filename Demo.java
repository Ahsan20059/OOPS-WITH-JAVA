public class TheDemo {
    int a,b;
    public void get(int a ,int b)
    {
        a=a;
        b=b;
    }
    public void put(){
        System.out.println("a= "+ a);
        System.out.println("b= "+ b);
    }
}
class Demo{
    public static void main(String[]args){
        TheDemo Ob1 = new TheDemo();
        Ob1.get(10,20);
        Ob1.put();
    }
}
