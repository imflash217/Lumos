// Calling static methods w/o reference to any other object.

class StaticTest{
    static int a = 5;
    static int b = 6;
    static void callme(){
        System.out.println("a = "+a);
    }
}

class main_13{
    public static void main(String args[]){
        StaticTest.callme();
        System.out.println("b = "+StaticTest.b);
    }
}
