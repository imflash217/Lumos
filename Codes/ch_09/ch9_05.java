// Dynamic Stack using interface

class DynamicStack implements StackInterface{
    private int stck[];
    private int tos;
    
    DynamicStack(int size){
        stck = new int[size];   // crerating a fixed-length array
        tos = -1;
    }
    
    // Defining the methods of interface StackInterface
    public void push(int item){
        
        // If the stack is Full... allocate a larger stack
        if(tos == stck.length-1){
            System.out.println("The stack is overflowing ... increasing the size of the stack :) !!!");
            int temp[] = new int[stck.length * 2];      // creating a temp array of double sixe that of stack
            for(int i=0; i<stck.length; i++){
                temp[i] = stck[i];  // transferring all contents of older stack to new bigger stack
            }
            stck = temp;    // transferring the nodes; now stck is double its older size
            stck[++tos] = item;     // filling elements into new bigger stack
        } else{
            stck[++tos] = item;
        }
    }
    
    // Defining the methods of interface StackInterface
    public int pop(){
        if(tos < 0){
            System.out.println("Stack underflow!!!!");
            return 0;
        }else{
            return stck[tos--];
        }
    }
}

class main_905{
    public static void main(String args[]){
        DynamicStack obj = new DynamicStack(17);
        float f = 5.0;
        double d = 35.0;
        int ii = 52;
        
        for (int i=0; i<25; i++){
            obj.push(i*i);
        }
        
        for (int i=24; i>=0; i--){
            System.out.println("["+i+"] = "+obj.pop());
        }
        System.out.println("f = " + f + " d = " + d + " i = "+ ii);
    }
}