// Automatic type conversions apply to overloading.
class OverloadDemo2{
    void test(){
        System.out.println("No Parameters!");
    }
    
    // Overload test for two integer parameters.
    void test(int a, int b){
        System.out.println("a and b: " + a + ", " + b);
    } 
    
    // Overload test for a double parameter
    void test(double d){
        System.out.println("Inside test(double) d : " + d);
    }
} // end class OverloadDemo2

class main_02{
    public static void main(String args[]){
        OverloadDemo2 ob = new OverloadDemo2(); // a new instant of OverloadDemo2()
        int i = 88;
        
        ob.test();          // calling 1st overloaded test()
        ob.test(10, 20);    // calling 2nd overload test(int,int)
        
        ob.test(i);         // this will invoke the test(double)
                            // b'coz there is no test() overload with single 'int' argument; 
                            // so Java automatically converts 'int' into 'double' & calls test(double) to execute.
                            
        ob.test(123.89);    // this will also invoke the test(double) 
    } // end main
} // end class main_02