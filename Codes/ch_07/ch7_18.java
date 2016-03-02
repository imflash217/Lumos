// varargs

class VarArgs{
    void test(String ... v){    // here 'v' is a variable-length 'Array'
        System.out.println("length of v = " + v.length + " : contents = ");
        
        for(String x : v){
            System.out.println(x + ", ");
        }
    }
}

class main_18{
    public static void main(String args[]){
        VarArgs obj = new VarArgs();
        obj.test("vinay", "prithvi", "sanyogita");
        obj.test("prithvi2", "sanyogita2");
        obj.test();
    }
}