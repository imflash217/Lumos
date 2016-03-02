// Primitive types are passed by value

class Test{
    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }
}


class Test_ref{
    int a, b;
    
    Test_ref(int i, int j){
        a = i;
        b = j;
    }
    
    void meth_ref(Test_ref o){
        o.a *= 2;
        o.b /= 2;
    }
}

class main_callByValue{
    public static void main(String args[]){
        Test ob = new Test();   // there was no constructor defined by us for Test class, so Java automatically defines a constructor for Test class
        int a = 12, b = 90;
        
        System.out.println("a & b before callByValue : " + a + ", " + b);
        
        // calling by value
        ob.meth(a, b);
        System.out.println("a & b after callByValue : " + a + ", " + b);
    }
}


class main_callByReference{
    public static void main(String args[]){
        Test_ref ob = new Test_ref(12, 90);
        
        System.out.println("ob.a & ob.b before callByReference : " + ob.a + ", " + ob.b);
        
        ob.meth_ref(ob);
        
        System.out.println("ob.a & ob.b after callByReference : " + ob.a +", " + ob.b);
    }
}

class main_callByBoth{
    public static void main(String args[]){
        int a = 12, b = 90;
        Test ob_val = new Test();
        Test_ref ob_ref = new Test_ref(a, b);
        
        System.out.println("CallByValue: before call : " + "a = " + a + ", " + "b = " + b);
        System.out.println("CallByReference : before call : " + "ob_ref.a = " + ob_ref.a + ", " + "ob_ref.b = " + ob_ref.b );
        
        ob_val.meth(a, b);          // call-by-value
        ob_ref.meth_ref(ob_ref);    // call-by-reference
        
        System.out.println("CallByValue: after call : " + "a = " + a + ", " + "b = " + b);
        System.out.println("CallByReference : after call : " + "ob_ref.a = " + ob_ref.a + ", " + "ob_ref.b = " + ob_ref.b );
        
    }
}