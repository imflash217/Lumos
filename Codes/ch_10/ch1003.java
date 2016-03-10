// throws example

class main_1003{
    static void test() throws IllegalAccessException{
        System.out.println("Inside main_1003.test()");
        throw new IllegalAccessException("throws");
    }
    
    public static void main(String args[]){
        try{
            test();
        }catch(IllegalAccessException e){
            System.out.print("Now inside main.try.catch() : " + e + "\n");
        }
    }
    
}
