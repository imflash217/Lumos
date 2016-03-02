class Stack{
    private int[] stck;
    private int tos;
    
    // Constructor and Initialize tos
    Stack(int n){
        stck = new int[n];
        tos = -1;
    }
    
    // Push elements in Stack
    void push(int i){
        if (tos == 9){
            System.out.println("Stack is full");
        }else{
            stck[++tos] = i;
        }
    }
    
    // Pop the elements from Stack
    int pop(){
        if(tos < 0){
            System.out.println("Stack is underflowing");
            return 0;
        }else{
            return stck[tos--];
        }
    }
}


class main_11{
    public static void main(String args[]){
        Stack obj1 = new Stack(5);
        Stack obj2 = new Stack(8);
        
        // Push some numbers into stacks
        for (int i=1; i<=5; i++) obj1.push(i);
        for (int i=1; i<=8; i++) obj2.push(i);
        
        // Pop those elements from stack
        for (int i=1; i<=5; i++) System.out.println(obj1.pop()+", ");
        for (int i=1; i<=8; i++) System.out.println(obj2.pop()+", ");
        
    }
}

