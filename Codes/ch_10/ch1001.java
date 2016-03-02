// Nested try-catch statements

class main_1001{
    public static void main(String args[]){

        try{
            int a = args.length;
            
            // generate a ArithmeticException:divisionBy Zero if, no arguments are provided @ runtime.
            int b = a/a;
            
            try{
                // generate a ArithmeticException:divisionBy Zero if, only One argument are provided @ runtime.
                if(a==1) {
                    b = a/(a-a);
                }
                
                if(a>=2){
                    int c[] = {123};
                    
                    // generate ArrayIndexOutOfBounds Exception
                    c[25] = a;  
                }
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("InnerTry's catch : ArrayIndexOutOfBounds : " + e);
            }
            
            if(a>=2){
                    int d[] = {589};
                    
                    // generate ArrayIndexOutOfBounds Exception
                    d[12] = a;  
                }
                
        } catch(ArithmeticException e){
                System.out.println("OuterTry's catch : Arithmetic Exception : " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("OuterTry's catch : ArrayIndexOutOfBounds : " + e);
        }
    }
}
