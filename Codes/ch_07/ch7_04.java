// Passing 'object' as parameters

// objects may be passed as parameters to methods

class Test{
    int a, b;
    
    Test(int i, int j){
        a = i;
        b = j;
    }
    
    
    boolean equals(Test o){     // passing object (Test) 'o' as parameter to method 'equals()'
        if(o.a == a && o.b == b){
            return true;
        } else {
            return false;
            
        }
    }
}

class main_04{
    public static void main(String args[]){
        Test ob1 = new Test (100, 200);
        Test ob2 = new Test (100, 200);
        Test ob3 = new Test (10, -5);
        
        System.out.println("ob1 == ob2 : " + ob1.equals(ob2));
        System.out.println("ob1 == ob3 : " + ob1.equals(ob3));
        System.out.println("ob2 == ob3 : " + ob3.equals(ob2));
        
    }   // end main
}

