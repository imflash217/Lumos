// static initialization

class StaticTest{
    
    static int a = 12;
    static int b;
    
    static{
        System.out.println("Static block initalized.");
        b = a * 4;
    }
    
    static void meth(int i){
        System.out.println("i = " + i);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}

class main_12{
    public static void main(String args[]){
        StaticTest obj = new StaticTest();
        obj.meth(15);
    }
}