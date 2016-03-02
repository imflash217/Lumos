// Defining 'inner' class within a for loop:

class OuterClass{
    int outerVariable = 14;
    
    void test(){
        for (int i=0; i<=10; i++){
            
            // Define the inner class
            class InnerClass{
                int y = 16;
                void display(){
                    System.out.println("display: outerVariable = " + outerVariable);    // inner class can access its parent-class's members.
                }
            }
            
            // Call the inner class by its object
            
            InnerClass innerClass = new InnerClass();
            innerClass.display();
            innerClass.y += i;  // CAN modify the innerclass variable outside the inner class using the 'object of inner class'
            System.out.println("innerClass.y = " + innerClass.y);   // OK
            // System.out.println("y = " + y);     // ERROR. members of inner class are not accessible outside the inner class w/o its object. 
        }
    }
}


class main_16{
    public static void main(String args[]){
        OuterClass obj = new OuterClass();
        obj.test();
    }
}