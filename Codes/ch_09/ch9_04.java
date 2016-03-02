// Implementing fixed-length stack using interface

class FixedStack implements StackInterface{
    private int stck[];
    private int tos;
    
    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }
    
    public void push(int item){
        if(tos == stck.length-1){
            System.out.println("Stack Overflow!!");
        }else{
            stck[++tos] = item;
        }
    }
    
    public int pop(){
        if(tos < 0){
            System.out.println("Stack underflow!!");
            return 0;
        } else{
            return stck[tos--];
        }
    }
}

class main_904{
    public static void main(String args[]){
        FixedStack obj = new FixedStack(5);
        FixedStack obj2 = new FixedStack(8);
        
        for(int i=0; i<5; i++){
            obj.push(i);
        }
        
        for(int i=0; i<8; i++){
            obj2.push(i);
        }
        
        for(int i=0; i<5; i++){
            System.out.println("["+i+"] = "+obj.pop());
        }
        
        for(int i=0; i<8; i++){
            System.out.println("["+i+"] = "+obj2.pop());
        }
    }
}