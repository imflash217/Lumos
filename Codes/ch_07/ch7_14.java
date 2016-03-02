// Arrays are implemented as objects and each array has a default variable 'length'

class Stack{
    int stck[];
    int tos;
    
    Stack(int stackSize){
        stck = new int[stackSize];
        tos = -1;   // tos cannot be < -1.
    }
    
    void push(int i){
        if(tos==stck.length){
            System.out.println("Stack Overflow");
        }else{
            stck[++tos] = i*i;
        }
    }
    
    int pop(){
        if (tos < 0){
            System.out.println("Stack underflow");
            return 0;
        } else{
            // System.out.println("["+tos+"]");
            return stck[tos--];
        }
    }
}

class main_14{
    public static void main(String args[]){
        final int SIZE1 = 7, SIZE2 = 9;
        Stack obj1 = new Stack(SIZE1);
        Stack obj2 = new Stack(SIZE2);
        System.out.println("length before" + obj1.stck.length);
        
        for(int i=0; i<obj1.stck.length; i++) {
            obj1.push(i);
        }
        
        for(int i=0; i<SIZE2; i++) {
            obj2.push(i);
        }
        
        for(int i=0; i<obj1.stck.length+3; i++) {
            System.out.println("["+i+"] = "+obj1.pop());
        }
        
        for(int i=0; i<SIZE2; i++) {
            System.out.println("["+i+"] = "+obj2.pop());
        }
    }
}