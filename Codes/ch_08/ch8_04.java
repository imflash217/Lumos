// Overriding methods of super-class

class ClassA{
    int a, b;
    
    ClassA(int i, int j){
        a = i;
        b = j;
    }
    
    void show(){
        System.out.println("Inside ClassA : a = " + a + " b = " + b);
    }
}

class ClassB extends ClassA{
    int c;
    ClassB(int i , int j, int k){
        super(i, j);
        c = k;
    }
    
    void show(String str){
        // Calling the show() method defined in super class ClassA
        // super.show();
        // Printing that the show() method of the sub-class ClassB is also defined and doesnot over-ride the show() method of the super-class ClassA
        System.out.println("Inside ClassB : " + " c = " + c + " & str = " + str);
    }
}

class main_804{
    public static void main(String args[]){
        ClassB obj = new ClassB(15, 17, 29);
        obj.show();     // calls the ClassA's show()
        obj.show("Hellow There");   // calls the ClassB's show(String str)
    }
}