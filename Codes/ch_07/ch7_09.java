// Avoiding the infinite loop while using 'recursion'

class Recursion{
    int values[];
    
    Recursion(int i){
        values = new int[i];
    }
    
    // Printing the 'values'
    
    void printArray(int i){
        if (i == 0) return;     // needed to avoid infinte loop and run-time error
        else {
        printArray(i-1);
        System.out.println("[" + (i-1) + "] = " + values[i-1]);
    }
    }
}

class main_09{
    public static void main(String args[]){
        Recursion obj = new Recursion(10);

        for(int i=0; i<10; i++) obj.values[i] = i;

        obj.printArray(10);
    }
}