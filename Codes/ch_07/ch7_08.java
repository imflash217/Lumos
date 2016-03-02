// Recursion

class Factorial{
    
    int fact(int n){
 
        if(n > 0){
            if(n == 1){
                return 1;
            } else{
                return fact(n-1)*n;
            }
        } else {
            
            System.out.println("number cannot be negative or zero");
            return 0;   // need to put a return statement as the return type of 'fact()' is 'int'
        }
    }
    
}

class main_08{
    public static void main(String args[]){
        Factorial factorial = new Factorial();
        
        int result;
        
        for(int n=-5; n<=10; n++){
            result = factorial.fact(n);
            System.out.print(n + "! = " + result + "\n");
        }
    }
}