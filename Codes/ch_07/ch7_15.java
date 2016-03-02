// Static class & Inner class

class OuterClass{
    int outerVariable = 10;
    static int outerStaticVariable = 15;
    
    void callNestedClasses(){
        
        // Calling the StaticNestedClass
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        staticNestedClass.display();
        
        // calling the inner class.
        InnerClass innerClass = new InnerClass();
        innerClass.display();
    }
    
    
    static class StaticNestedClass{
        OuterClass obj_staticClass = new OuterClass();
        void display(){
            System.out.println("StaticClass w/ object reference: outerVariable = " + obj_staticClass.outerVariable);
            // System.out.println("StaticClass w/o object reference: outerVariable = " + outerVariable);   // ERROR, static nested class don't exist w/o its parent class
            System.out.println("StaticClass w/o object reference: outerStaticVariable = " + outerStaticVariable);   // static nested class can access 'static' variables/members of its parent-class w/o object
        }
    }
    
    // Defining InnerClass (non-static nested class)
    class InnerClass{
        void display(){
            System.out.println("InnerClass : outerVariable = " + outerVariable); // the inner class is calling the variable of its parent class w/o objects.
        }
    }
}

class main_15{
    public static void main(String args[]){
        OuterClass obj = new OuterClass();
        obj.callNestedClasses();
    }
}