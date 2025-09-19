class Stats {
    static int num =3;
    
    static void set(){
        num++;
    }
    void get(){
        System.out.println("Num ="+num);
    }
}
class Main{
    public static void main(String[] args){
        Stats ob1 = new Stats();
        Stats ob2 = new Stats();
        Stats ob3 = new Stats();
        
        ob1.set();
        ob1.set();
        ob2.set();
        ob2.set();
        ob3.set();
        ob3.set();
        ob3.set();
        ob3.set();
        
        ob1.get();
        ob2.get();
        ob3.get();
    }
}