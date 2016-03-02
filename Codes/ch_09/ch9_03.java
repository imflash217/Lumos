// Nested interfaces

// This class contains a nested interface
class InterfaceClass {
    // Nested Interface
    interface NestedIFace{
        void callme(int i);
    }
}

class ImplementingInterface implements InterfaceClass.NestedIFace{  // while implementing a nested interface, use the fully qualified name of interface
    public void callme(int i){
        System.out.println("Inside ImplementingInterface");
    }
}

class main_903{
    public static void main (String args[]){
        NestedIFace obj = new ImplementingInterface();
        obj.callme(17);
    }
}