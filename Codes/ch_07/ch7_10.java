//  Access Specifiers

class AccessSpecifiers{
    int a; // default specifier(public)
    public int b;
    private int c;
    
    void setc(int i){
        c = i;  // setting the value of 'c'
    }
    
    int getc(){
        return c;
    }
}

class main_10{
    public static void main(String args[]){
        AccessSpecifiers obj = new AccessSpecifiers();
        
        // Setting the values of a, b, c

        try {
            obj.a = 11;     // OK
        } catch(Exception e) {
            System.out.println("obj.a : Access not provided");
        }
        
        try {
            obj.b = 12;     // OK
        } catch(Exception e) {
            System.out.println("obj.b : Access not provided");
        }
        
        // try {
        //     obj.c = 13;     // ERROR
        // } catch(Exception e) {
        //     System.out.println("obj.c : Access not provided");
        // }
        
        try {
            obj.setc(14);
            System.out.println("obj.c = " + obj.getc());
        } catch(Exception e) {
            System.out.println("obj.setc() : Access not provided even by calling the function setc()");
        }
    }
}