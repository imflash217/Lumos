// implementing an interface

class ImplementingInterface implements Callback{
    
    // Implement and initialize all methods of interface (Callback) as 'public'
    public void callBack(int i){
        System.out.println("Inside interface method : callBack : int i = " + i);
    }
    
    // We can also implement non-interface methods as well
    void nonIFaceMeth(){
        System.out.println("Inside non-Interface Method");
    }
}

class ImplementingInterface2 implements Callback{
    // Implement and initialize all methods of interface (Callback) as 'public'
    public void callBack(int i){
        System.out.println("Inside interface method : callBack : int i = " + i*i);
    }
}

class main_902{
    public static void main(String args[]){
        ImplementingInterface obj = new ImplementingInterface();
        Callback interface_obj = new ImplementingInterface();
        interface_obj.callBack(2);
        obj.callBack(17);
        obj.nonIFaceMeth();
    }
}

class main_902b{
    public static void main (String args[]){
        Callback obj = new ImplementingInterface();
        ImplementingInterface2 obj2 = new ImplementingInterface2();
        obj.callBack(7);
        obj = obj2;
        obj.callBack(7);
    }
}