// Dynamic Method dispatch

class ClassA{
    void callMe(){
        System.out.println("Inside ClassA");
    }
}

class ClassB extends ClassA{
    void callMe(){
        System.out.println("Inside ClassB");
    }
}

class ClassC extends ClassA{
    void callMe(){
        super.callMe();     // used if we want to call the callMe() method defined in the super class.
        System.out.println("Inside ClassC");
    }
}

class main_805{
    public static void main(String args[]){
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        ClassC objC = new ClassC();
        
        ClassA ref;     // a reference object of superClass ClassA
        
        ref = objA;
        ref.callMe();   // calls callMe() defined in ClassA
        
        ref = objB;
        ref.callMe();   // calls callMe() defined in ClassB
        
        ref = objC;
        ref.callMe();   // calls callMe() defined in ClassC
    }
}