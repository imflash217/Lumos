// throw demo

class main_1002{
    static void test(){
        try{
            System.out.println("Before 'throw' is called");
            throw new NullPointerException("throw inside test()");
            // System.out.println("After throw is called");    // Unreachable statement b'coz execution stops after 'throw' clause and the control goes to the caught() block
                                                            // and any statement after 'throw' is not executed
        }catch(NullPointerException e){
            System.out.println("throw Exception is CAUGHT");
            throw e;    // Re-throw the exception
        }
    }
    
    
    public static void main(String args[]){
        try{
            test();
        }catch(NullPointerException e){
            System.out.println("re-thrown exception is Re-Caught : " + e);
        }
    }
}